package org.modelmapper.internal.asm;

import androidx.core.view.InputDeviceCompat;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* loaded from: classes4.dex */
public class ClassReader {
    static final int EXPAND_ASM_INSNS = 256;
    public static final int EXPAND_FRAMES = 8;
    private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;
    public final byte[] b;
    private final int[] bootstrapMethodOffsets;
    private final int[] cpInfoOffsets;
    private final Object[] cpInfoValues;
    public final int header;
    private final int maxStringLength;

    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ClassReader(byte[] bArr, int i, int i2) {
        this(bArr, i, true);
    }

    ClassReader(byte[] bArr, int i, boolean z) {
        this.b = bArr;
        if (z) {
            int i2 = i + 6;
            if (readShort(i2) > 56) {
                throw new IllegalArgumentException("Unsupported class file major version " + ((int) readShort(i2)));
            }
        }
        int readUnsignedShort = readUnsignedShort(i + 8);
        this.cpInfoOffsets = new int[readUnsignedShort];
        this.cpInfoValues = new Object[readUnsignedShort];
        int i3 = i + 10;
        int i4 = 1;
        int i5 = 0;
        while (true) {
            int i6 = 4;
            if (i4 < readUnsignedShort) {
                int i7 = i4 + 1;
                int i8 = i3 + 1;
                this.cpInfoOffsets[i4] = i8;
                switch (bArr[i3]) {
                    case 1:
                        i6 = readUnsignedShort(i8) + 3;
                        if (i6 > i5) {
                            i5 = i6;
                            break;
                        }
                        break;
                    case 2:
                    case 13:
                    case 14:
                    default:
                        throw new IllegalArgumentException();
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 17:
                    case 18:
                        i6 = 5;
                        break;
                    case 5:
                    case 6:
                        i4 += 2;
                        i6 = 9;
                        continue;
                        i3 += i6;
                    case 7:
                    case 8:
                    case 16:
                    case 19:
                    case 20:
                        i4 = i7;
                        i6 = 3;
                        continue;
                        i3 += i6;
                    case 15:
                        break;
                }
                i4 = i7;
                i3 += i6;
            } else {
                this.maxStringLength = i5;
                this.header = i3;
                int firstAttributeOffset = getFirstAttributeOffset();
                int[] iArr = null;
                for (int readUnsignedShort2 = readUnsignedShort(firstAttributeOffset - 2); readUnsignedShort2 > 0; readUnsignedShort2--) {
                    String readUTF8 = readUTF8(firstAttributeOffset, new char[this.maxStringLength]);
                    int readInt = readInt(firstAttributeOffset + 2);
                    int i9 = firstAttributeOffset + 6;
                    if ("BootstrapMethods".equals(readUTF8)) {
                        int readUnsignedShort3 = readUnsignedShort(i9);
                        int[] iArr2 = new int[readUnsignedShort3];
                        int i10 = firstAttributeOffset + 8;
                        for (int i11 = 0; i11 < readUnsignedShort3; i11++) {
                            iArr2[i11] = i10;
                            i10 += (readUnsignedShort(i10 + 2) * 2) + 4;
                        }
                        iArr = iArr2;
                    }
                    firstAttributeOffset = i9 + readInt;
                }
                this.bootstrapMethodOffsets = iArr;
                return;
            }
        }
    }

    public ClassReader(InputStream inputStream) throws IOException {
        this(readStream(inputStream, false));
    }

    public ClassReader(String str) throws IOException {
        this(readStream(ClassLoader.getSystemResourceAsStream(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ClassFileLocator.CLASS_FILE_EXTENSION), true));
    }

    private static byte[] readStream(InputStream inputStream, boolean z) throws IOException {
        if (inputStream == null) {
            throw new IOException("Class not found");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr, 0, 4096);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public String getClassName() {
        return readClass(this.header + 2, new char[this.maxStringLength]);
    }

    public String getSuperName() {
        return readClass(this.header + 4, new char[this.maxStringLength]);
    }

    public String[] getInterfaces() {
        int i = this.header + 6;
        int readUnsignedShort = readUnsignedShort(i);
        String[] strArr = new String[readUnsignedShort];
        if (readUnsignedShort > 0) {
            char[] cArr = new char[this.maxStringLength];
            for (int i2 = 0; i2 < readUnsignedShort; i2++) {
                i += 2;
                strArr[i2] = readClass(i, cArr);
            }
        }
        return strArr;
    }

    public void accept(ClassVisitor classVisitor, int i) {
        accept(classVisitor, new Attribute[0], i);
    }

    public void accept(ClassVisitor classVisitor, Attribute[] attributeArr, int i) {
        int i2;
        int i3;
        int i4;
        String[] strArr;
        Context context = new Context();
        context.attributePrototypes = attributeArr;
        context.parsingOptions = i;
        context.charBuffer = new char[this.maxStringLength];
        char[] cArr = context.charBuffer;
        int i5 = this.header;
        int readUnsignedShort = readUnsignedShort(i5);
        String readClass = readClass(i5 + 2, cArr);
        String readClass2 = readClass(i5 + 4, cArr);
        int readUnsignedShort2 = readUnsignedShort(i5 + 6);
        String[] strArr2 = new String[readUnsignedShort2];
        int i6 = i5 + 8;
        for (int i7 = 0; i7 < readUnsignedShort2; i7++) {
            strArr2[i7] = readClass(i6, cArr);
            i6 += 2;
        }
        int firstAttributeOffset = getFirstAttributeOffset();
        int i8 = readUnsignedShort;
        int readUnsignedShort3 = readUnsignedShort(firstAttributeOffset - 2);
        String str = null;
        String str2 = null;
        int i9 = 0;
        String str3 = null;
        int i10 = 0;
        String str4 = null;
        String str5 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        Attribute attribute = null;
        int i17 = 0;
        while (readUnsignedShort3 > 0) {
            String readUTF8 = readUTF8(firstAttributeOffset, cArr);
            int readInt = readInt(firstAttributeOffset + 2);
            int i18 = firstAttributeOffset + 6;
            String str6 = str;
            if ("SourceFile".equals(readUTF8)) {
                i2 = i18;
                str2 = readUTF8(i18, cArr);
            } else if ("InnerClasses".equals(readUTF8)) {
                i17 = i18;
                i2 = i17;
            } else if ("EnclosingMethod".equals(readUTF8)) {
                i11 = i18;
                i2 = i11;
            } else if ("NestHost".equals(readUTF8)) {
                i2 = i18;
                str5 = readClass(i18, cArr);
            } else if ("NestMembers".equals(readUTF8)) {
                i16 = i18;
                i2 = i16;
            } else {
                if ("Signature".equals(readUTF8)) {
                    str3 = readUTF8(i18, cArr);
                } else if ("RuntimeVisibleAnnotations".equals(readUTF8)) {
                    i12 = i18;
                    i2 = i12;
                } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF8)) {
                    i14 = i18;
                    i2 = i14;
                } else if ("Deprecated".equals(readUTF8)) {
                    i8 |= 131072;
                } else if ("Synthetic".equals(readUTF8)) {
                    i8 |= 4096;
                } else if ("SourceDebugExtension".equals(readUTF8)) {
                    str = readUTF(i18, readInt, new char[readInt]);
                    i2 = i18;
                    i3 = i6;
                    i4 = readInt;
                    strArr = strArr2;
                    firstAttributeOffset = i2 + i4;
                    readUnsignedShort3--;
                    strArr2 = strArr;
                    i6 = i3;
                } else if ("RuntimeInvisibleAnnotations".equals(readUTF8)) {
                    i13 = i18;
                    i2 = i13;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF8)) {
                    i15 = i18;
                    i2 = i15;
                } else if ("Module".equals(readUTF8)) {
                    i9 = i18;
                    i2 = i9;
                } else if ("ModuleMainClass".equals(readUTF8)) {
                    str4 = readClass(i18, cArr);
                } else if ("ModulePackages".equals(readUTF8)) {
                    i10 = i18;
                    i2 = i10;
                } else if (!"BootstrapMethods".equals(readUTF8)) {
                    i2 = i18;
                    i3 = i6;
                    i4 = readInt;
                    strArr = strArr2;
                    Attribute readAttribute = readAttribute(attributeArr, readUTF8, i2, readInt, cArr, -1, null);
                    readAttribute.nextAttribute = attribute;
                    attribute = readAttribute;
                    i8 = i8;
                    str = str6;
                    str2 = str2;
                    firstAttributeOffset = i2 + i4;
                    readUnsignedShort3--;
                    strArr2 = strArr;
                    i6 = i3;
                }
                i2 = i18;
            }
            i3 = i6;
            i4 = readInt;
            strArr = strArr2;
            str = str6;
            firstAttributeOffset = i2 + i4;
            readUnsignedShort3--;
            strArr2 = strArr;
            i6 = i3;
        }
        String str7 = str;
        String str8 = str2;
        int i19 = i6;
        String[] strArr3 = strArr2;
        Attribute attribute2 = attribute;
        classVisitor.visit(readInt(this.cpInfoOffsets[1] - 7), i8, readClass, str3, readClass2, strArr3);
        if ((i & 2) == 0 && (str8 != null || str7 != null)) {
            classVisitor.visitSource(str8, str7);
        }
        if (i9 != 0) {
            readModule(classVisitor, context, i9, i10, str4);
        }
        String str9 = str5;
        if (str9 != null) {
            classVisitor.visitNestHostExperimental(str9);
        }
        int i20 = i11;
        if (i20 != 0) {
            String readClass3 = readClass(i20, cArr);
            int readUnsignedShort4 = readUnsignedShort(i20 + 2);
            classVisitor.visitOuterClass(readClass3, readUnsignedShort4 == 0 ? null : readUTF8(this.cpInfoOffsets[readUnsignedShort4], cArr), readUnsignedShort4 == 0 ? null : readUTF8(this.cpInfoOffsets[readUnsignedShort4] + 2, cArr));
        }
        int i21 = i12;
        if (i21 != 0) {
            int readUnsignedShort5 = readUnsignedShort(i21);
            int i22 = i21 + 2;
            while (true) {
                int i23 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                i22 = readElementValues(classVisitor.visitAnnotation(readUTF8(i22, cArr), true), i22 + 2, true, cArr);
                readUnsignedShort5 = i23;
            }
        }
        int i24 = i13;
        if (i24 != 0) {
            int readUnsignedShort6 = readUnsignedShort(i24);
            int i25 = i24 + 2;
            while (true) {
                int i26 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                i25 = readElementValues(classVisitor.visitAnnotation(readUTF8(i25, cArr), false), i25 + 2, true, cArr);
                readUnsignedShort6 = i26;
            }
        }
        int i27 = i14;
        if (i27 != 0) {
            int readUnsignedShort7 = readUnsignedShort(i27);
            int i28 = i27 + 2;
            while (true) {
                int i29 = readUnsignedShort7 - 1;
                if (readUnsignedShort7 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = readTypeAnnotationTarget(context, i28);
                i28 = readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort7 = i29;
            }
        }
        int i30 = i15;
        if (i30 != 0) {
            int readUnsignedShort8 = readUnsignedShort(i30);
            int i31 = i30 + 2;
            while (true) {
                int i32 = readUnsignedShort8 - 1;
                if (readUnsignedShort8 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = readTypeAnnotationTarget(context, i31);
                i31 = readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort8 = i32;
            }
        }
        while (attribute2 != null) {
            Attribute attribute3 = attribute2.nextAttribute;
            attribute2.nextAttribute = null;
            classVisitor.visitAttribute(attribute2);
            attribute2 = attribute3;
        }
        int i33 = i16;
        if (i33 != 0) {
            int readUnsignedShort9 = readUnsignedShort(i33);
            int i34 = i33 + 2;
            while (true) {
                int i35 = readUnsignedShort9 - 1;
                if (readUnsignedShort9 <= 0) {
                    break;
                }
                classVisitor.visitNestMemberExperimental(readClass(i34, cArr));
                i34 += 2;
                readUnsignedShort9 = i35;
            }
        }
        int i36 = i17;
        if (i36 != 0) {
            int readUnsignedShort10 = readUnsignedShort(i36);
            int i37 = i36 + 2;
            while (true) {
                int i38 = readUnsignedShort10 - 1;
                if (readUnsignedShort10 <= 0) {
                    break;
                }
                classVisitor.visitInnerClass(readClass(i37, cArr), readClass(i37 + 2, cArr), readUTF8(i37 + 4, cArr), readUnsignedShort(i37 + 6));
                i37 += 8;
                readUnsignedShort10 = i38;
            }
        }
        int readUnsignedShort11 = readUnsignedShort(i19);
        int i39 = i19 + 2;
        while (true) {
            int i40 = readUnsignedShort11 - 1;
            if (readUnsignedShort11 <= 0) {
                break;
            }
            i39 = readField(classVisitor, context, i39);
            readUnsignedShort11 = i40;
        }
        int readUnsignedShort12 = readUnsignedShort(i39);
        int i41 = i39 + 2;
        while (true) {
            int i42 = readUnsignedShort12 - 1;
            if (readUnsignedShort12 > 0) {
                i41 = readMethod(classVisitor, context, i41);
                readUnsignedShort12 = i42;
            } else {
                classVisitor.visitEnd();
                return;
            }
        }
    }

    private void readModule(ClassVisitor classVisitor, Context context, int i, int i2, String str) {
        String[] strArr;
        char[] cArr = context.charBuffer;
        int i3 = i + 6;
        ModuleVisitor visitModule = classVisitor.visitModule(readModule(i, cArr), readUnsignedShort(i + 2), readUTF8(i + 4, cArr));
        if (visitModule == null) {
            return;
        }
        if (str != null) {
            visitModule.visitMainClass(str);
        }
        if (i2 != 0) {
            int readUnsignedShort = readUnsignedShort(i2);
            int i4 = i2 + 2;
            while (true) {
                int i5 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                visitModule.visitPackage(readPackage(i4, cArr));
                i4 += 2;
                readUnsignedShort = i5;
            }
        }
        int readUnsignedShort2 = readUnsignedShort(i3);
        int i6 = i + 8;
        while (true) {
            int i7 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            String readModule = readModule(i6, cArr);
            int readUnsignedShort3 = readUnsignedShort(i6 + 2);
            String readUTF8 = readUTF8(i6 + 4, cArr);
            i6 += 6;
            visitModule.visitRequire(readModule, readUnsignedShort3, readUTF8);
            readUnsignedShort2 = i7;
        }
        int readUnsignedShort4 = readUnsignedShort(i6);
        int i8 = i6 + 2;
        while (true) {
            int i9 = readUnsignedShort4 - 1;
            String[] strArr2 = null;
            if (readUnsignedShort4 <= 0) {
                break;
            }
            String readPackage = readPackage(i8, cArr);
            int readUnsignedShort5 = readUnsignedShort(i8 + 2);
            int readUnsignedShort6 = readUnsignedShort(i8 + 4);
            i8 += 6;
            if (readUnsignedShort6 != 0) {
                strArr2 = new String[readUnsignedShort6];
                for (int i10 = 0; i10 < readUnsignedShort6; i10++) {
                    strArr2[i10] = readModule(i8, cArr);
                    i8 += 2;
                }
            }
            visitModule.visitExport(readPackage, readUnsignedShort5, strArr2);
            readUnsignedShort4 = i9;
        }
        int readUnsignedShort7 = readUnsignedShort(i8);
        int i11 = i8 + 2;
        while (true) {
            int i12 = readUnsignedShort7 - 1;
            if (readUnsignedShort7 <= 0) {
                break;
            }
            String readPackage2 = readPackage(i11, cArr);
            int readUnsignedShort8 = readUnsignedShort(i11 + 2);
            int readUnsignedShort9 = readUnsignedShort(i11 + 4);
            i11 += 6;
            if (readUnsignedShort9 != 0) {
                strArr = new String[readUnsignedShort9];
                for (int i13 = 0; i13 < readUnsignedShort9; i13++) {
                    strArr[i13] = readModule(i11, cArr);
                    i11 += 2;
                }
            } else {
                strArr = null;
            }
            visitModule.visitOpen(readPackage2, readUnsignedShort8, strArr);
            readUnsignedShort7 = i12;
        }
        int readUnsignedShort10 = readUnsignedShort(i11);
        int i14 = i11 + 2;
        while (true) {
            int i15 = readUnsignedShort10 - 1;
            if (readUnsignedShort10 <= 0) {
                break;
            }
            visitModule.visitUse(readClass(i14, cArr));
            i14 += 2;
            readUnsignedShort10 = i15;
        }
        int readUnsignedShort11 = readUnsignedShort(i14);
        int i16 = i14 + 2;
        while (true) {
            int i17 = readUnsignedShort11 - 1;
            if (readUnsignedShort11 > 0) {
                String readClass = readClass(i16, cArr);
                int readUnsignedShort12 = readUnsignedShort(i16 + 2);
                i16 += 4;
                String[] strArr3 = new String[readUnsignedShort12];
                for (int i18 = 0; i18 < readUnsignedShort12; i18++) {
                    strArr3[i18] = readClass(i16, cArr);
                    i16 += 2;
                }
                visitModule.visitProvide(readClass, strArr3);
                readUnsignedShort11 = i17;
            } else {
                visitModule.visitEnd();
                return;
            }
        }
    }

    private int readField(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        int i3;
        Context context2 = context;
        char[] cArr = context2.charBuffer;
        int readUnsignedShort = readUnsignedShort(i);
        String readUTF8 = readUTF8(i + 2, cArr);
        String readUTF82 = readUTF8(i + 4, cArr);
        int readUnsignedShort2 = readUnsignedShort(i + 6);
        int i4 = i + 8;
        int i5 = readUnsignedShort;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        Attribute attribute = null;
        String str = null;
        Object obj = null;
        while (true) {
            int i10 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            String readUTF83 = readUTF8(i4, cArr);
            int readInt = readInt(i4 + 2);
            int i11 = i4 + 6;
            if ("ConstantValue".equals(readUTF83)) {
                int readUnsignedShort3 = readUnsignedShort(i11);
                obj = readUnsignedShort3 == 0 ? null : readConst(readUnsignedShort3, cArr);
            } else if ("Signature".equals(readUTF83)) {
                str = readUTF8(i11, cArr);
            } else {
                if ("Deprecated".equals(readUTF83)) {
                    i3 = 131072 | i5;
                } else if ("Synthetic".equals(readUTF83)) {
                    i3 = i5 | 4096;
                } else {
                    if ("RuntimeVisibleAnnotations".equals(readUTF83)) {
                        i9 = i11;
                        i2 = i9;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF83)) {
                        i7 = i11;
                        i2 = i7;
                    } else if ("RuntimeInvisibleAnnotations".equals(readUTF83)) {
                        i8 = i11;
                        i2 = i8;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF83)) {
                        i6 = i11;
                        i2 = i6;
                    } else {
                        i2 = i11;
                        Attribute attribute2 = attribute;
                        attribute = readAttribute(context2.attributePrototypes, readUTF83, i2, readInt, cArr, -1, null);
                        attribute.nextAttribute = attribute2;
                        i8 = i8;
                        i9 = i9;
                        i6 = i6;
                        i7 = i7;
                    }
                    i4 = i2 + readInt;
                    context2 = context;
                    readUnsignedShort2 = i10;
                }
                i5 = i3;
            }
            i2 = i11;
            i4 = i2 + readInt;
            context2 = context;
            readUnsignedShort2 = i10;
        }
        Attribute attribute3 = attribute;
        int i12 = i6;
        int i13 = i7;
        int i14 = i8;
        int i15 = i9;
        FieldVisitor visitField = classVisitor.visitField(i5, readUTF8, readUTF82, str, obj);
        if (visitField == null) {
            return i4;
        }
        if (i15 != 0) {
            int readUnsignedShort4 = readUnsignedShort(i15);
            int i16 = i15 + 2;
            while (true) {
                int i17 = readUnsignedShort4 - 1;
                if (readUnsignedShort4 <= 0) {
                    break;
                }
                i16 = readElementValues(visitField.visitAnnotation(readUTF8(i16, cArr), true), i16 + 2, true, cArr);
                readUnsignedShort4 = i17;
            }
        }
        if (i14 != 0) {
            int readUnsignedShort5 = readUnsignedShort(i14);
            int i18 = i14 + 2;
            while (true) {
                int i19 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                i18 = readElementValues(visitField.visitAnnotation(readUTF8(i18, cArr), false), i18 + 2, true, cArr);
                readUnsignedShort5 = i19;
            }
        }
        if (i13 != 0) {
            int readUnsignedShort6 = readUnsignedShort(i13);
            int i20 = i13 + 2;
            while (true) {
                int i21 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = readTypeAnnotationTarget(context, i20);
                i20 = readElementValues(visitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort6 = i21;
            }
        }
        if (i12 != 0) {
            int readUnsignedShort7 = readUnsignedShort(i12);
            int i22 = i12 + 2;
            while (true) {
                int i23 = readUnsignedShort7 - 1;
                if (readUnsignedShort7 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = readTypeAnnotationTarget(context, i22);
                i22 = readElementValues(visitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort7 = i23;
            }
        }
        while (true) {
            Attribute attribute4 = attribute3;
            if (attribute4 != null) {
                attribute3 = attribute4.nextAttribute;
                attribute4.nextAttribute = null;
                visitField.visitAttribute(attribute4);
            } else {
                visitField.visitEnd();
                return i4;
            }
        }
    }

    private int readMethod(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        int i3;
        char[] cArr = context.charBuffer;
        context.currentMethodAccessFlags = readUnsignedShort(i);
        context.currentMethodName = readUTF8(i + 2, cArr);
        int i4 = i + 4;
        context.currentMethodDescriptor = readUTF8(i4, cArr);
        int readUnsignedShort = readUnsignedShort(i + 6);
        int i5 = i + 8;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        Attribute attribute = null;
        boolean z = false;
        int i13 = 0;
        String[] strArr = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = readUnsignedShort - 1;
            if (readUnsignedShort <= 0) {
                break;
            }
            String readUTF8 = readUTF8(i5, cArr);
            int readInt = readInt(i5 + 2);
            int i18 = i12;
            int i19 = i5 + 6;
            int i20 = i6;
            if ("Code".equals(readUTF8)) {
                if ((context.parsingOptions & 1) == 0) {
                    i16 = i19;
                    i3 = i16;
                    i12 = i18;
                    i6 = i20;
                    i5 = i3 + readInt;
                    readUnsignedShort = i17;
                } else {
                    i2 = i7;
                    i3 = i19;
                    i12 = i18;
                    i6 = i20;
                }
            } else {
                if ("Exceptions".equals(readUTF8)) {
                    int readUnsignedShort2 = readUnsignedShort(i19);
                    String[] strArr2 = new String[readUnsignedShort2];
                    int i21 = i5 + 8;
                    i2 = i7;
                    for (int i22 = 0; i22 < readUnsignedShort2; i22++) {
                        strArr2[i22] = readClass(i21, cArr);
                        i21 += 2;
                    }
                    strArr = strArr2;
                    i13 = i19;
                    i3 = i13;
                } else {
                    i2 = i7;
                    if ("Signature".equals(readUTF8)) {
                        i3 = i19;
                        i6 = i20;
                        i7 = i2;
                        i12 = readUnsignedShort(i19);
                    } else if ("Deprecated".equals(readUTF8)) {
                        context.currentMethodAccessFlags |= 131072;
                        i3 = i19;
                    } else if ("RuntimeVisibleAnnotations".equals(readUTF8)) {
                        i9 = i19;
                        i3 = i9;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF8)) {
                        i7 = i19;
                        i3 = i7;
                        i12 = i18;
                        i6 = i20;
                    } else if ("AnnotationDefault".equals(readUTF8)) {
                        i11 = i19;
                        i3 = i11;
                    } else if ("Synthetic".equals(readUTF8)) {
                        context.currentMethodAccessFlags |= 4096;
                        i3 = i19;
                        i12 = i18;
                        i6 = i20;
                        i7 = i2;
                        z = true;
                    } else if ("RuntimeInvisibleAnnotations".equals(readUTF8)) {
                        i8 = i19;
                        i3 = i8;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF8)) {
                        i6 = i19;
                        i3 = i6;
                        i12 = i18;
                    } else if ("RuntimeVisibleParameterAnnotations".equals(readUTF8)) {
                        i14 = i19;
                        i3 = i14;
                    } else if ("RuntimeInvisibleParameterAnnotations".equals(readUTF8)) {
                        i15 = i19;
                        i3 = i15;
                    } else if ("MethodParameters".equals(readUTF8)) {
                        i10 = i19;
                        i3 = i10;
                    } else {
                        i3 = i19;
                        Attribute readAttribute = readAttribute(context.attributePrototypes, readUTF8, i19, readInt, cArr, -1, null);
                        readAttribute.nextAttribute = attribute;
                        attribute = readAttribute;
                        i12 = i18;
                        i6 = i20;
                        i7 = i2;
                        i8 = i8;
                        i9 = i9;
                        i10 = i10;
                        i11 = i11;
                    }
                    i5 = i3 + readInt;
                    readUnsignedShort = i17;
                }
                i12 = i18;
                i6 = i20;
            }
            i7 = i2;
            i5 = i3 + readInt;
            readUnsignedShort = i17;
        }
        int i23 = i6;
        int i24 = i7;
        int i25 = i8;
        int i26 = i9;
        int i27 = i10;
        int i28 = i11;
        MethodVisitor visitMethod = classVisitor.visitMethod(context.currentMethodAccessFlags, context.currentMethodName, context.currentMethodDescriptor, i12 == 0 ? null : readUTF(i12, cArr), strArr);
        if (visitMethod == null) {
            return i5;
        }
        if (visitMethod instanceof MethodWriter) {
            if (((MethodWriter) visitMethod).canCopyMethodAttributes(this, i, i5 - i, z, (context.currentMethodAccessFlags & 131072) != 0, readUnsignedShort(i4), i12, i13)) {
                return i5;
            }
        }
        if (i27 != 0) {
            int readByte = readByte(i27);
            int i29 = i27 + 1;
            while (true) {
                int i30 = readByte - 1;
                if (readByte <= 0) {
                    break;
                }
                visitMethod.visitParameter(readUTF8(i29, cArr), readUnsignedShort(i29 + 2));
                i29 += 4;
                readByte = i30;
            }
        }
        if (i28 != 0) {
            AnnotationVisitor visitAnnotationDefault = visitMethod.visitAnnotationDefault();
            readElementValue(visitAnnotationDefault, i28, null, cArr);
            if (visitAnnotationDefault != null) {
                visitAnnotationDefault.visitEnd();
            }
        }
        if (i26 != 0) {
            int readUnsignedShort3 = readUnsignedShort(i26);
            int i31 = i26 + 2;
            while (true) {
                int i32 = readUnsignedShort3 - 1;
                if (readUnsignedShort3 <= 0) {
                    break;
                }
                i31 = readElementValues(visitMethod.visitAnnotation(readUTF8(i31, cArr), true), i31 + 2, true, cArr);
                readUnsignedShort3 = i32;
            }
        }
        if (i25 != 0) {
            int readUnsignedShort4 = readUnsignedShort(i25);
            int i33 = i25 + 2;
            while (true) {
                int i34 = readUnsignedShort4 - 1;
                if (readUnsignedShort4 <= 0) {
                    break;
                }
                i33 = readElementValues(visitMethod.visitAnnotation(readUTF8(i33, cArr), false), i33 + 2, true, cArr);
                readUnsignedShort4 = i34;
            }
        }
        if (i24 != 0) {
            int readUnsignedShort5 = readUnsignedShort(i24);
            int i35 = i24 + 2;
            while (true) {
                int i36 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = readTypeAnnotationTarget(context, i35);
                i35 = readElementValues(visitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort5 = i36;
            }
        }
        if (i23 != 0) {
            int readUnsignedShort6 = readUnsignedShort(i23);
            int i37 = i23 + 2;
            while (true) {
                int i38 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = readTypeAnnotationTarget(context, i37);
                i37 = readElementValues(visitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort6 = i38;
            }
        }
        int i39 = i14;
        if (i39 != 0) {
            readParameterAnnotations(visitMethod, context, i39, true);
        }
        int i40 = i15;
        if (i40 != 0) {
            readParameterAnnotations(visitMethod, context, i40, false);
        }
        while (attribute != null) {
            Attribute attribute2 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            visitMethod.visitAttribute(attribute);
            attribute = attribute2;
        }
        int i41 = i16;
        if (i41 != 0) {
            visitMethod.visitCode();
            readCode(visitMethod, context, i41);
        }
        visitMethod.visitEnd();
        return i5;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private void readCode(org.modelmapper.internal.asm.MethodVisitor r39, org.modelmapper.internal.asm.Context r40, int r41) {
        /*
            Method dump skipped, instructions count: 3354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.modelmapper.internal.asm.ClassReader.readCode(org.modelmapper.internal.asm.MethodVisitor, org.modelmapper.internal.asm.Context, int):void");
    }

    protected Label readLabel(int i, Label[] labelArr) {
        if (labelArr[i] == null) {
            labelArr[i] = new Label();
        }
        return labelArr[i];
    }

    private Label createLabel(int i, Label[] labelArr) {
        Label readLabel = readLabel(i, labelArr);
        readLabel.flags = (short) (readLabel.flags & (-2));
        return readLabel;
    }

    private void createDebugLabel(int i, Label[] labelArr) {
        if (labelArr[i] == null) {
            Label readLabel = readLabel(i, labelArr);
            readLabel.flags = (short) (readLabel.flags | 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int[] readTypeAnnotations(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int i2;
        char[] cArr = context.charBuffer;
        int readUnsignedShort = readUnsignedShort(i);
        int[] iArr = new int[readUnsignedShort];
        int i3 = i + 2;
        for (int i4 = 0; i4 < readUnsignedShort; i4++) {
            iArr[i4] = i3;
            int readInt = readInt(i3);
            int i5 = readInt >>> 24;
            if (i5 != 23) {
                switch (i5) {
                    default:
                        switch (i5) {
                            case 64:
                            case 65:
                                int readUnsignedShort2 = readUnsignedShort(i3 + 1);
                                i2 = i3 + 3;
                                while (true) {
                                    int i6 = readUnsignedShort2 - 1;
                                    if (readUnsignedShort2 <= 0) {
                                        break;
                                    } else {
                                        int readUnsignedShort3 = readUnsignedShort(i2);
                                        int readUnsignedShort4 = readUnsignedShort(i2 + 2);
                                        i2 += 6;
                                        createLabel(readUnsignedShort3, context.currentMethodLabels);
                                        createLabel(readUnsignedShort3 + readUnsignedShort4, context.currentMethodLabels);
                                        readUnsignedShort2 = i6;
                                    }
                                }
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i2 = i3 + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        int readByte = readByte(i2);
                        if (i5 == 66) {
                            TypePath typePath = readByte != 0 ? new TypePath(this.b, i2) : null;
                            int i7 = i2 + (readByte * 2) + 1;
                            i3 = readElementValues(methodVisitor.visitTryCatchAnnotation(readInt & InputDeviceCompat.SOURCE_ANY, typePath, readUTF8(i7, cArr), z), i7 + 2, true, cArr);
                        } else {
                            i3 = readElementValues(null, i2 + (readByte * 2) + 3, true, cArr);
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = i3 + 3;
                        int readByte2 = readByte(i2);
                        if (i5 == 66) {
                        }
                        break;
                }
            }
            i2 = i3 + 3;
            int readByte22 = readByte(i2);
            if (i5 == 66) {
            }
        }
        return iArr;
    }

    private int getTypeAnnotationBytecodeOffset(int[] iArr, int i) {
        if (iArr == null || i >= iArr.length || readByte(iArr[i]) < 67) {
            return -1;
        }
        return readUnsignedShort(iArr[i] + 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int readTypeAnnotationTarget(Context context, int i) {
        int i2;
        int i3;
        int readInt = readInt(i);
        int i4 = readInt >>> 24;
        if (i4 != 0 && i4 != 1) {
            switch (i4) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = readInt & InputDeviceCompat.SOURCE_ANY;
                    i3 = i + 3;
                    context.currentTypeAnnotationTarget = i2;
                    int readByte = readByte(i3);
                    context.currentTypeAnnotationTargetPath = readByte != 0 ? null : new TypePath(this.b, i3);
                    return i3 + 1 + (readByte * 2);
                case 19:
                case 20:
                case 21:
                    i2 = readInt & (-16777216);
                    i3 = i + 1;
                    context.currentTypeAnnotationTarget = i2;
                    int readByte2 = readByte(i3);
                    context.currentTypeAnnotationTargetPath = readByte2 != 0 ? null : new TypePath(this.b, i3);
                    return i3 + 1 + (readByte2 * 2);
                case 22:
                    break;
                default:
                    switch (i4) {
                        case 64:
                        case 65:
                            i2 = readInt & (-16777216);
                            int readUnsignedShort = readUnsignedShort(i + 1);
                            i3 = i + 3;
                            context.currentLocalVariableAnnotationRangeStarts = new Label[readUnsignedShort];
                            context.currentLocalVariableAnnotationRangeEnds = new Label[readUnsignedShort];
                            context.currentLocalVariableAnnotationRangeIndices = new int[readUnsignedShort];
                            for (int i5 = 0; i5 < readUnsignedShort; i5++) {
                                int readUnsignedShort2 = readUnsignedShort(i3);
                                int readUnsignedShort3 = readUnsignedShort(i3 + 2);
                                int readUnsignedShort4 = readUnsignedShort(i3 + 4);
                                i3 += 6;
                                context.currentLocalVariableAnnotationRangeStarts[i5] = createLabel(readUnsignedShort2, context.currentMethodLabels);
                                context.currentLocalVariableAnnotationRangeEnds[i5] = createLabel(readUnsignedShort2 + readUnsignedShort3, context.currentMethodLabels);
                                context.currentLocalVariableAnnotationRangeIndices[i5] = readUnsignedShort4;
                            }
                            context.currentTypeAnnotationTarget = i2;
                            int readByte22 = readByte(i3);
                            context.currentTypeAnnotationTargetPath = readByte22 != 0 ? null : new TypePath(this.b, i3);
                            return i3 + 1 + (readByte22 * 2);
                        case 66:
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = readInt & (-16777216);
                            i3 = i + 3;
                            context.currentTypeAnnotationTarget = i2;
                            int readByte222 = readByte(i3);
                            context.currentTypeAnnotationTargetPath = readByte222 != 0 ? null : new TypePath(this.b, i3);
                            return i3 + 1 + (readByte222 * 2);
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = readInt & (-16776961);
                            i3 = i + 4;
                            context.currentTypeAnnotationTarget = i2;
                            int readByte2222 = readByte(i3);
                            context.currentTypeAnnotationTargetPath = readByte2222 != 0 ? null : new TypePath(this.b, i3);
                            return i3 + 1 + (readByte2222 * 2);
                        default:
                            throw new IllegalArgumentException();
                    }
            }
        }
        i2 = readInt & (-65536);
        i3 = i + 2;
        context.currentTypeAnnotationTarget = i2;
        int readByte22222 = readByte(i3);
        context.currentTypeAnnotationTargetPath = readByte22222 != 0 ? null : new TypePath(this.b, i3);
        return i3 + 1 + (readByte22222 * 2);
    }

    private void readParameterAnnotations(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int i2 = i + 1;
        int i3 = this.b[i] & 255;
        methodVisitor.visitAnnotableParameterCount(i3, z);
        char[] cArr = context.charBuffer;
        for (int i4 = 0; i4 < i3; i4++) {
            int readUnsignedShort = readUnsignedShort(i2);
            i2 += 2;
            while (true) {
                int i5 = readUnsignedShort - 1;
                if (readUnsignedShort > 0) {
                    i2 = readElementValues(methodVisitor.visitParameterAnnotation(i4, readUTF8(i2, cArr), z), i2 + 2, true, cArr);
                    readUnsignedShort = i5;
                }
            }
        }
    }

    private int readElementValues(AnnotationVisitor annotationVisitor, int i, boolean z, char[] cArr) {
        int readUnsignedShort = readUnsignedShort(i);
        int i2 = i + 2;
        if (!z) {
            while (true) {
                int i3 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                i2 = readElementValue(annotationVisitor, i2, null, cArr);
                readUnsignedShort = i3;
            }
        } else {
            while (true) {
                int i4 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                i2 = readElementValue(annotationVisitor, i2 + 2, readUTF8(i2, cArr), cArr);
                readUnsignedShort = i4;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return i2;
    }

    private int readElementValue(AnnotationVisitor annotationVisitor, int i, String str, char[] cArr) {
        int i2 = 0;
        if (annotationVisitor == null) {
            int i3 = this.b[i] & 255;
            if (i3 == 64) {
                return readElementValues(null, i + 3, true, cArr);
            }
            if (i3 != 91) {
                return i3 != 101 ? i + 3 : i + 5;
            }
            return readElementValues(null, i + 1, false, cArr);
        }
        int i4 = i + 1;
        int i5 = this.b[i] & 255;
        if (i5 != 64) {
            if (i5 != 70) {
                if (i5 == 83) {
                    annotationVisitor.visit(str, Short.valueOf((short) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                } else if (i5 == 99) {
                    annotationVisitor.visit(str, Type.getType(readUTF8(i4, cArr)));
                } else {
                    if (i5 == 101) {
                        annotationVisitor.visitEnum(str, readUTF8(i4, cArr), readUTF8(i + 3, cArr));
                        return i + 5;
                    }
                    if (i5 == 115) {
                        annotationVisitor.visit(str, readUTF8(i4, cArr));
                    } else if (i5 != 73 && i5 != 74) {
                        if (i5 == 90) {
                            annotationVisitor.visit(str, readInt(this.cpInfoOffsets[readUnsignedShort(i4)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                        } else if (i5 != 91) {
                            switch (i5) {
                                case 66:
                                    annotationVisitor.visit(str, Byte.valueOf((byte) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                                    break;
                                case 67:
                                    annotationVisitor.visit(str, Character.valueOf((char) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                                    break;
                                case 68:
                                    break;
                                default:
                                    throw new IllegalArgumentException();
                            }
                        } else {
                            int readUnsignedShort = readUnsignedShort(i4);
                            int i6 = i + 3;
                            if (readUnsignedShort == 0) {
                                return readElementValues(annotationVisitor.visitArray(str), i + 1, false, cArr);
                            }
                            int i7 = this.b[i6] & 255;
                            if (i7 == 70) {
                                float[] fArr = new float[readUnsignedShort];
                                while (i2 < readUnsignedShort) {
                                    fArr[i2] = Float.intBitsToFloat(readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                                    i6 += 3;
                                    i2++;
                                }
                                annotationVisitor.visit(str, fArr);
                            } else if (i7 == 83) {
                                short[] sArr = new short[readUnsignedShort];
                                while (i2 < readUnsignedShort) {
                                    sArr[i2] = (short) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                    i6 += 3;
                                    i2++;
                                }
                                annotationVisitor.visit(str, sArr);
                            } else if (i7 == 90) {
                                boolean[] zArr = new boolean[readUnsignedShort];
                                for (int i8 = 0; i8 < readUnsignedShort; i8++) {
                                    zArr[i8] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]) != 0;
                                    i6 += 3;
                                }
                                annotationVisitor.visit(str, zArr);
                            } else if (i7 == 73) {
                                int[] iArr = new int[readUnsignedShort];
                                while (i2 < readUnsignedShort) {
                                    iArr[i2] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                    i6 += 3;
                                    i2++;
                                }
                                annotationVisitor.visit(str, iArr);
                            } else if (i7 != 74) {
                                switch (i7) {
                                    case 66:
                                        byte[] bArr = new byte[readUnsignedShort];
                                        while (i2 < readUnsignedShort) {
                                            bArr[i2] = (byte) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                            i6 += 3;
                                            i2++;
                                        }
                                        annotationVisitor.visit(str, bArr);
                                        break;
                                    case 67:
                                        char[] cArr2 = new char[readUnsignedShort];
                                        while (i2 < readUnsignedShort) {
                                            cArr2[i2] = (char) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                            i6 += 3;
                                            i2++;
                                        }
                                        annotationVisitor.visit(str, cArr2);
                                        break;
                                    case 68:
                                        double[] dArr = new double[readUnsignedShort];
                                        while (i2 < readUnsignedShort) {
                                            dArr[i2] = Double.longBitsToDouble(readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                                            i6 += 3;
                                            i2++;
                                        }
                                        annotationVisitor.visit(str, dArr);
                                        break;
                                    default:
                                        return readElementValues(annotationVisitor.visitArray(str), i + 1, false, cArr);
                                }
                            } else {
                                long[] jArr = new long[readUnsignedShort];
                                while (i2 < readUnsignedShort) {
                                    jArr[i2] = readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                    i6 += 3;
                                    i2++;
                                }
                                annotationVisitor.visit(str, jArr);
                            }
                            return i6;
                        }
                    }
                }
                return i + 3;
            }
            annotationVisitor.visit(str, readConst(readUnsignedShort(i4), cArr));
            return i + 3;
        }
        return readElementValues(annotationVisitor.visitAnnotation(str, readUTF8(i4, cArr)), i + 3, true, cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0050, code lost:
    
        r11.currentFrameLocalCount = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0052, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void computeImplicitFrame(Context context) {
        int i;
        String str = context.currentMethodDescriptor;
        Object[] objArr = context.currentFrameLocalTypes;
        int i2 = 0;
        if ((context.currentMethodAccessFlags & 8) == 0) {
            if (MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(context.currentMethodName)) {
                objArr[0] = Opcodes.UNINITIALIZED_THIS;
            } else {
                objArr[0] = readClass(this.header + 2, context.charBuffer);
            }
            i2 = 1;
        }
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt == 'F') {
                i = i2 + 1;
                objArr[i2] = Opcodes.FLOAT;
            } else if (charAt != 'L') {
                if (charAt != 'S' && charAt != 'I') {
                    if (charAt == 'J') {
                        i = i2 + 1;
                        objArr[i2] = Opcodes.LONG;
                    } else if (charAt != 'Z') {
                        if (charAt != '[') {
                            switch (charAt) {
                                case 'D':
                                    i = i2 + 1;
                                    objArr[i2] = Opcodes.DOUBLE;
                                    break;
                            }
                        } else {
                            while (str.charAt(i4) == '[') {
                                i4++;
                            }
                            if (str.charAt(i4) == 'L') {
                                do {
                                    i4++;
                                } while (str.charAt(i4) != ';');
                            }
                            int i5 = i4 + 1;
                            objArr[i2] = str.substring(i3, i5);
                            i3 = i5;
                            i2++;
                        }
                    }
                }
                i = i2 + 1;
                objArr[i2] = Opcodes.INTEGER;
            } else {
                int i6 = i4;
                while (str.charAt(i6) != ';') {
                    i6++;
                }
                objArr[i2] = str.substring(i4, i6);
                i2++;
                i3 = i6 + 1;
            }
            i2 = i;
            i3 = i4;
        }
    }

    private int readStackMapFrame(int i, boolean z, boolean z2, Context context) {
        int i2;
        int i3;
        char[] cArr = context.charBuffer;
        Label[] labelArr = context.currentMethodLabels;
        if (z) {
            i2 = i + 1;
            i3 = this.b[i] & 255;
        } else {
            context.currentFrameOffset = -1;
            i2 = i;
            i3 = 255;
        }
        context.currentFrameLocalCountDelta = 0;
        if (i3 < 64) {
            context.currentFrameType = 3;
            context.currentFrameStackCount = 0;
        } else if (i3 < 128) {
            i3 -= 64;
            i2 = readVerificationTypeInfo(i2, context.currentFrameStackTypes, 0, cArr, labelArr);
            context.currentFrameType = 4;
            context.currentFrameStackCount = 1;
        } else if (i3 >= 247) {
            int readUnsignedShort = readUnsignedShort(i2);
            int i4 = i2 + 2;
            if (i3 == 247) {
                i2 = readVerificationTypeInfo(i4, context.currentFrameStackTypes, 0, cArr, labelArr);
                context.currentFrameType = 4;
                context.currentFrameStackCount = 1;
            } else {
                if (i3 >= 248 && i3 < 251) {
                    context.currentFrameType = 2;
                    context.currentFrameLocalCountDelta = 251 - i3;
                    context.currentFrameLocalCount -= context.currentFrameLocalCountDelta;
                    context.currentFrameStackCount = 0;
                } else if (i3 == 251) {
                    context.currentFrameType = 3;
                    context.currentFrameStackCount = 0;
                } else if (i3 < 255) {
                    int i5 = i3 - 251;
                    int i6 = z2 ? context.currentFrameLocalCount : 0;
                    i2 = i4;
                    int i7 = i5;
                    while (i7 > 0) {
                        i2 = readVerificationTypeInfo(i2, context.currentFrameLocalTypes, i6, cArr, labelArr);
                        i7--;
                        i6++;
                    }
                    context.currentFrameType = 1;
                    context.currentFrameLocalCountDelta = i5;
                    context.currentFrameLocalCount += context.currentFrameLocalCountDelta;
                    context.currentFrameStackCount = 0;
                } else {
                    int readUnsignedShort2 = readUnsignedShort(i4);
                    int i8 = i2 + 4;
                    context.currentFrameType = 0;
                    context.currentFrameLocalCountDelta = readUnsignedShort2;
                    context.currentFrameLocalCount = readUnsignedShort2;
                    for (int i9 = 0; i9 < readUnsignedShort2; i9++) {
                        i8 = readVerificationTypeInfo(i8, context.currentFrameLocalTypes, i9, cArr, labelArr);
                    }
                    int readUnsignedShort3 = readUnsignedShort(i8);
                    i2 = i8 + 2;
                    context.currentFrameStackCount = readUnsignedShort3;
                    for (int i10 = 0; i10 < readUnsignedShort3; i10++) {
                        i2 = readVerificationTypeInfo(i2, context.currentFrameStackTypes, i10, cArr, labelArr);
                    }
                }
                i2 = i4;
            }
            i3 = readUnsignedShort;
        } else {
            throw new IllegalArgumentException();
        }
        context.currentFrameOffset += i3 + 1;
        createLabel(context.currentFrameOffset, labelArr);
        return i2;
    }

    private int readVerificationTypeInfo(int i, Object[] objArr, int i2, char[] cArr, Label[] labelArr) {
        int i3 = i + 1;
        switch (this.b[i] & 255) {
            case 0:
                objArr[i2] = Opcodes.TOP;
                return i3;
            case 1:
                objArr[i2] = Opcodes.INTEGER;
                return i3;
            case 2:
                objArr[i2] = Opcodes.FLOAT;
                return i3;
            case 3:
                objArr[i2] = Opcodes.DOUBLE;
                return i3;
            case 4:
                objArr[i2] = Opcodes.LONG;
                return i3;
            case 5:
                objArr[i2] = Opcodes.NULL;
                return i3;
            case 6:
                objArr[i2] = Opcodes.UNINITIALIZED_THIS;
                return i3;
            case 7:
                objArr[i2] = readClass(i3, cArr);
                break;
            case 8:
                objArr[i2] = createLabel(readUnsignedShort(i3), labelArr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i + 3;
    }

    final int getFirstAttributeOffset() {
        int i = this.header;
        int readUnsignedShort = i + 8 + (readUnsignedShort(i + 6) * 2);
        int readUnsignedShort2 = readUnsignedShort(readUnsignedShort);
        int i2 = readUnsignedShort + 2;
        while (true) {
            int i3 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            int readUnsignedShort3 = readUnsignedShort(i2 + 6);
            i2 += 8;
            while (true) {
                int i4 = readUnsignedShort3 - 1;
                if (readUnsignedShort3 > 0) {
                    i2 += readInt(i2 + 2) + 6;
                    readUnsignedShort3 = i4;
                }
            }
            readUnsignedShort2 = i3;
        }
        int readUnsignedShort4 = readUnsignedShort(i2);
        int i5 = i2 + 2;
        while (true) {
            int i6 = readUnsignedShort4 - 1;
            if (readUnsignedShort4 <= 0) {
                return i5 + 2;
            }
            int readUnsignedShort5 = readUnsignedShort(i5 + 6);
            i5 += 8;
            while (true) {
                int i7 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 > 0) {
                    i5 += readInt(i5 + 2) + 6;
                    readUnsignedShort5 = i7;
                }
            }
            readUnsignedShort4 = i6;
        }
    }

    private Attribute readAttribute(Attribute[] attributeArr, String str, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        for (int i4 = 0; i4 < attributeArr.length; i4++) {
            if (attributeArr[i4].type.equals(str)) {
                return attributeArr[i4].read(this, i, i2, cArr, i3, labelArr);
            }
        }
        return new Attribute(str).read(this, i, i2, null, -1, null);
    }

    public int getItemCount() {
        return this.cpInfoOffsets.length;
    }

    public int getItem(int i) {
        return this.cpInfoOffsets[i];
    }

    public int getMaxStringLength() {
        return this.maxStringLength;
    }

    public int readByte(int i) {
        return this.b[i] & 255;
    }

    public int readUnsignedShort(int i) {
        byte[] bArr = this.b;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public short readShort(int i) {
        byte[] bArr = this.b;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int readInt(int i) {
        byte[] bArr = this.b;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public long readLong(int i) {
        return (readInt(i) << 32) | (readInt(i + 4) & 4294967295L);
    }

    public String readUTF8(int i, char[] cArr) {
        int readUnsignedShort = readUnsignedShort(i);
        if (i == 0 || readUnsignedShort == 0) {
            return null;
        }
        return readUTF(readUnsignedShort, cArr);
    }

    final String readUTF(int i, char[] cArr) {
        String str = (String) this.cpInfoValues[i];
        if (str != null) {
            return str;
        }
        int i2 = this.cpInfoOffsets[i];
        String readUTF = readUTF(i2 + 2, readUnsignedShort(i2), cArr);
        this.cpInfoValues[i] = readUTF;
        return readUTF;
    }

    private String readUTF(int i, int i2, char[] cArr) {
        int i3;
        int i4 = i2 + i;
        byte[] bArr = this.b;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i];
            if ((b & 128) == 0) {
                cArr[i5] = (char) (b & Byte.MAX_VALUE);
                i5++;
                i = i6;
            } else {
                if ((b & 224) == 192) {
                    i3 = i5 + 1;
                    i += 2;
                    cArr[i5] = (char) (((b & Ascii.US) << 6) + (bArr[i6] & 63));
                } else {
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    cArr[i5] = (char) (((b & Ascii.SI) << 12) + ((bArr[i6] & 63) << 6) + (bArr[i7] & 63));
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }

    private String readStringish(int i, char[] cArr) {
        return readUTF8(this.cpInfoOffsets[readUnsignedShort(i)], cArr);
    }

    public String readClass(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public String readModule(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public String readPackage(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    private ConstantDynamic readConstantDynamic(int i, char[] cArr) {
        ConstantDynamic constantDynamic = (ConstantDynamic) this.cpInfoValues[i];
        if (constantDynamic != null) {
            return constantDynamic;
        }
        int[] iArr = this.cpInfoOffsets;
        int i2 = iArr[i];
        int i3 = iArr[readUnsignedShort(i2 + 2)];
        String readUTF8 = readUTF8(i3, cArr);
        String readUTF82 = readUTF8(i3 + 2, cArr);
        int i4 = this.bootstrapMethodOffsets[readUnsignedShort(i2)];
        Handle handle = (Handle) readConst(readUnsignedShort(i4), cArr);
        int readUnsignedShort = readUnsignedShort(i4 + 2);
        Object[] objArr = new Object[readUnsignedShort];
        int i5 = i4 + 4;
        for (int i6 = 0; i6 < readUnsignedShort; i6++) {
            objArr[i6] = readConst(readUnsignedShort(i5), cArr);
            i5 += 2;
        }
        ConstantDynamic constantDynamic2 = new ConstantDynamic(readUTF8, readUTF82, handle, objArr);
        this.cpInfoValues[i] = constantDynamic2;
        return constantDynamic2;
    }

    public Object readConst(int i, char[] cArr) {
        int i2 = this.cpInfoOffsets[i];
        byte b = this.b[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(readInt(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(readInt(i2)));
            case 5:
                return Long.valueOf(readLong(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(readLong(i2)));
            case 7:
                return Type.getObjectType(readUTF8(i2, cArr));
            case 8:
                return readUTF8(i2, cArr);
            default:
                switch (b) {
                    case 15:
                        int readByte = readByte(i2);
                        int i3 = this.cpInfoOffsets[readUnsignedShort(i2 + 1)];
                        int i4 = this.cpInfoOffsets[readUnsignedShort(i3 + 2)];
                        return new Handle(readByte, readClass(i3, cArr), readUTF8(i4, cArr), readUTF8(i4 + 2, cArr), this.b[i3 - 1] == 11);
                    case 16:
                        return Type.getMethodType(readUTF8(i2, cArr));
                    case 17:
                        return readConstantDynamic(i, cArr);
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}
