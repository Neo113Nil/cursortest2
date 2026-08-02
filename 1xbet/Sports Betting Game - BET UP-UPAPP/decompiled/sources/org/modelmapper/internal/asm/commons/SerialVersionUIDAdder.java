package org.modelmapper.internal.asm.commons;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* loaded from: classes4.dex */
public class SerialVersionUIDAdder extends ClassVisitor {
    private static final String CLINIT = "<clinit>";
    private int access;
    private boolean computeSVUID;
    private boolean hasSVUID;
    private boolean hasStaticInitializer;
    private String[] interfaces;
    private String name;
    private Collection<Item> svuidConstructors;
    private Collection<Item> svuidFields;
    private Collection<Item> svuidMethods;

    public SerialVersionUIDAdder(ClassVisitor classVisitor) {
        this(Opcodes.ASM6, classVisitor);
        if (getClass() != SerialVersionUIDAdder.class) {
            throw new IllegalStateException();
        }
    }

    protected SerialVersionUIDAdder(int i, ClassVisitor classVisitor) {
        super(i, classVisitor);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        boolean z = (i2 & 16384) == 0;
        this.computeSVUID = z;
        if (z) {
            this.name = str;
            this.access = i2;
            this.interfaces = new String[strArr.length];
            this.svuidFields = new ArrayList();
            this.svuidConstructors = new ArrayList();
            this.svuidMethods = new ArrayList();
            System.arraycopy(strArr, 0, this.interfaces, 0, strArr.length);
        }
        super.visit(i, i2, str, str2, str3, strArr);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        if (this.computeSVUID) {
            if ("<clinit>".equals(str)) {
                this.hasStaticInitializer = true;
            }
            int i2 = i & 3391;
            if ((i & 2) == 0) {
                if (MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(str)) {
                    this.svuidConstructors.add(new Item(str, i2, str2));
                } else if (!"<clinit>".equals(str)) {
                    this.svuidMethods.add(new Item(str, i2, str2));
                }
            }
        }
        return super.visitMethod(i, str, str2, str3, strArr);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        if (this.computeSVUID) {
            if ("serialVersionUID".equals(str)) {
                this.computeSVUID = false;
                this.hasSVUID = true;
            }
            if ((i & 2) == 0 || (i & 136) == 0) {
                this.svuidFields.add(new Item(str, i & 223, str2));
            }
        }
        return super.visitField(i, str, str2, str3, obj);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitInnerClass(String str, String str2, String str3, int i) {
        String str4 = this.name;
        if (str4 != null && str4.equals(str)) {
            this.access = i;
        }
        super.visitInnerClass(str, str2, str3, i);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitEnd() {
        if (this.computeSVUID && !this.hasSVUID) {
            try {
                addSVUID(computeSVUID());
            } catch (IOException e) {
                throw new IllegalStateException("Error while computing SVUID for " + this.name, e);
            }
        }
        super.visitEnd();
    }

    public boolean hasSVUID() {
        return this.hasSVUID;
    }

    protected void addSVUID(long j) {
        FieldVisitor visitField = super.visitField(24, "serialVersionUID", "J", null, Long.valueOf(j));
        if (visitField != null) {
            visitField.visitEnd();
        }
    }

    protected long computeSVUID() throws IOException {
        DataOutputStream dataOutputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        } catch (Throwable th2) {
            dataOutputStream = null;
            th = th2;
        }
        try {
            dataOutputStream.writeUTF(this.name.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
            int i = this.access;
            if ((i & 512) != 0) {
                i = this.svuidMethods.isEmpty() ? i & (-1025) : i | 1024;
            }
            dataOutputStream.writeInt(i & 1553);
            Arrays.sort(this.interfaces);
            for (String str : this.interfaces) {
                dataOutputStream.writeUTF(str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
            }
            writeItems(this.svuidFields, dataOutputStream, false);
            if (this.hasStaticInitializer) {
                dataOutputStream.writeUTF("<clinit>");
                dataOutputStream.writeInt(8);
                dataOutputStream.writeUTF("()V");
            }
            writeItems(this.svuidConstructors, dataOutputStream, true);
            writeItems(this.svuidMethods, dataOutputStream, true);
            dataOutputStream.flush();
            long j = 0;
            for (int min = Math.min(computeSHAdigest(byteArrayOutputStream.toByteArray()).length, 8) - 1; min >= 0; min--) {
                j = (j << 8) | (r0[min] & 255);
            }
            dataOutputStream.close();
            return j;
        } catch (Throwable th3) {
            th = th3;
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            throw th;
        }
    }

    protected byte[] computeSHAdigest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA").digest(bArr);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e.toString());
        }
    }

    private static void writeItems(Collection<Item> collection, DataOutput dataOutput, boolean z) throws IOException {
        Item[] itemArr = (Item[]) collection.toArray(new Item[collection.size()]);
        Arrays.sort(itemArr, new Comparator<Item>() { // from class: org.modelmapper.internal.asm.commons.SerialVersionUIDAdder.1
            @Override // java.util.Comparator
            public int compare(Item item, Item item2) {
                int compareTo = item.name.compareTo(item2.name);
                return compareTo == 0 ? item.descriptor.compareTo(item2.descriptor) : compareTo;
            }
        });
        for (Item item : itemArr) {
            dataOutput.writeUTF(item.name);
            dataOutput.writeInt(item.access);
            String str = item.descriptor;
            if (z) {
                str = str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            }
            dataOutput.writeUTF(str);
        }
    }

    private static final class Item {
        final int access;
        final String descriptor;
        final String name;

        Item(String str, int i, String str2) {
            this.name = str;
            this.access = i;
            this.descriptor = str2;
        }
    }
}
