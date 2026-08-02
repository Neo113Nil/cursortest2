package org.modelmapper.internal.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.Attribute;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.ModuleVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.TypePath;

/* loaded from: classes4.dex */
public class ClassNode extends ClassVisitor {
    public int access;
    public List<Attribute> attrs;
    public List<FieldNode> fields;
    public List<InnerClassNode> innerClasses;
    public List<String> interfaces;
    public List<AnnotationNode> invisibleAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public List<MethodNode> methods;
    public ModuleNode module;
    public String name;
    public String nestHostClassExperimental;
    public List<String> nestMembersExperimental;
    public String outerClass;
    public String outerMethod;
    public String outerMethodDesc;
    public String signature;
    public String sourceDebug;
    public String sourceFile;
    public String superName;
    public int version;
    public List<AnnotationNode> visibleAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitEnd() {
    }

    public ClassNode() {
        this(Opcodes.ASM6);
        if (getClass() != ClassNode.class) {
            throw new IllegalStateException();
        }
    }

    public ClassNode(int i) {
        super(i);
        this.interfaces = new ArrayList();
        this.innerClasses = new ArrayList();
        this.fields = new ArrayList();
        this.methods = new ArrayList();
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.version = i;
        this.access = i2;
        this.name = str;
        this.signature = str2;
        this.superName = str3;
        this.interfaces = Util.asArrayList(strArr);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitSource(String str, String str2) {
        this.sourceFile = str;
        this.sourceDebug = str2;
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public ModuleVisitor visitModule(String str, int i, String str2) {
        ModuleNode moduleNode = new ModuleNode(str, i, str2);
        this.module = moduleNode;
        return moduleNode;
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitNestHostExperimental(String str) {
        this.nestHostClassExperimental = str;
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitOuterClass(String str, String str2, String str3) {
        this.outerClass = str;
        this.outerMethod = str2;
        this.outerMethodDesc = str3;
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z) {
            if (this.visibleAnnotations == null) {
                this.visibleAnnotations = new ArrayList(1);
            }
            this.visibleAnnotations.add(annotationNode);
        } else {
            if (this.invisibleAnnotations == null) {
                this.invisibleAnnotations = new ArrayList(1);
            }
            this.invisibleAnnotations.add(annotationNode);
        }
        return annotationNode;
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i, typePath, str);
        if (z) {
            if (this.visibleTypeAnnotations == null) {
                this.visibleTypeAnnotations = new ArrayList(1);
            }
            this.visibleTypeAnnotations.add(typeAnnotationNode);
        } else {
            if (this.invisibleTypeAnnotations == null) {
                this.invisibleTypeAnnotations = new ArrayList(1);
            }
            this.invisibleTypeAnnotations.add(typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitAttribute(Attribute attribute) {
        if (this.attrs == null) {
            this.attrs = new ArrayList(1);
        }
        this.attrs.add(attribute);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitNestMemberExperimental(String str) {
        if (this.nestMembersExperimental == null) {
            this.nestMembersExperimental = new ArrayList();
        }
        this.nestMembersExperimental.add(str);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitInnerClass(String str, String str2, String str3, int i) {
        this.innerClasses.add(new InnerClassNode(str, str2, str3, i));
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        FieldNode fieldNode = new FieldNode(i, str, str2, str3, obj);
        this.fields.add(fieldNode);
        return fieldNode;
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        MethodNode methodNode = new MethodNode(i, str, str2, str3, strArr);
        this.methods.add(methodNode);
        return methodNode;
    }

    public void check(int i) {
        if (i < 17235968 && (this.nestHostClassExperimental != null || this.nestMembersExperimental != null)) {
            throw new UnsupportedClassVersionException();
        }
        if (i < 393216 && this.module != null) {
            throw new UnsupportedClassVersionException();
        }
        if (i < 327680) {
            List<TypeAnnotationNode> list = this.visibleTypeAnnotations;
            if (list != null && !list.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            List<TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
            if (list2 != null && !list2.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
        }
        List<AnnotationNode> list3 = this.visibleAnnotations;
        if (list3 != null) {
            for (int size = list3.size() - 1; size >= 0; size--) {
                this.visibleAnnotations.get(size).check(i);
            }
        }
        List<AnnotationNode> list4 = this.invisibleAnnotations;
        if (list4 != null) {
            for (int size2 = list4.size() - 1; size2 >= 0; size2--) {
                this.invisibleAnnotations.get(size2).check(i);
            }
        }
        List<TypeAnnotationNode> list5 = this.visibleTypeAnnotations;
        if (list5 != null) {
            for (int size3 = list5.size() - 1; size3 >= 0; size3--) {
                this.visibleTypeAnnotations.get(size3).check(i);
            }
        }
        List<TypeAnnotationNode> list6 = this.invisibleTypeAnnotations;
        if (list6 != null) {
            for (int size4 = list6.size() - 1; size4 >= 0; size4--) {
                this.invisibleTypeAnnotations.get(size4).check(i);
            }
        }
        for (int size5 = this.fields.size() - 1; size5 >= 0; size5--) {
            this.fields.get(size5).check(i);
        }
        for (int size6 = this.methods.size() - 1; size6 >= 0; size6--) {
            this.methods.get(size6).check(i);
        }
    }

    public void accept(ClassVisitor classVisitor) {
        String[] strArr = new String[this.interfaces.size()];
        this.interfaces.toArray(strArr);
        classVisitor.visit(this.version, this.access, this.name, this.signature, this.superName, strArr);
        String str = this.sourceFile;
        if (str != null || this.sourceDebug != null) {
            classVisitor.visitSource(str, this.sourceDebug);
        }
        ModuleNode moduleNode = this.module;
        if (moduleNode != null) {
            moduleNode.accept(classVisitor);
        }
        String str2 = this.nestHostClassExperimental;
        if (str2 != null) {
            classVisitor.visitNestHostExperimental(str2);
        }
        String str3 = this.outerClass;
        if (str3 != null) {
            classVisitor.visitOuterClass(str3, this.outerMethod, this.outerMethodDesc);
        }
        List<AnnotationNode> list = this.visibleAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnnotationNode annotationNode = this.visibleAnnotations.get(i);
                annotationNode.accept(classVisitor.visitAnnotation(annotationNode.desc, true));
            }
        }
        List<AnnotationNode> list2 = this.invisibleAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotationNode annotationNode2 = this.invisibleAnnotations.get(i2);
                annotationNode2.accept(classVisitor.visitAnnotation(annotationNode2.desc, false));
            }
        }
        List<TypeAnnotationNode> list3 = this.visibleTypeAnnotations;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i3);
                typeAnnotationNode.accept(classVisitor.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list4 = this.invisibleTypeAnnotations;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i4);
                typeAnnotationNode2.accept(classVisitor.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
        List<Attribute> list5 = this.attrs;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                classVisitor.visitAttribute(this.attrs.get(i5));
            }
        }
        List<String> list6 = this.nestMembersExperimental;
        if (list6 != null) {
            int size6 = list6.size();
            for (int i6 = 0; i6 < size6; i6++) {
                classVisitor.visitNestMemberExperimental(this.nestMembersExperimental.get(i6));
            }
        }
        int size7 = this.innerClasses.size();
        for (int i7 = 0; i7 < size7; i7++) {
            this.innerClasses.get(i7).accept(classVisitor);
        }
        int size8 = this.fields.size();
        for (int i8 = 0; i8 < size8; i8++) {
            this.fields.get(i8).accept(classVisitor);
        }
        int size9 = this.methods.size();
        for (int i9 = 0; i9 < size9; i9++) {
            this.methods.get(i9).accept(classVisitor);
        }
        classVisitor.visitEnd();
    }
}
