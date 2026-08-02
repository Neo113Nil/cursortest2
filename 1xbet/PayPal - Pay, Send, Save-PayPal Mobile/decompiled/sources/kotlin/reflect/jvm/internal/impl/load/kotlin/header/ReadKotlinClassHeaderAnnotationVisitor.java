package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

/* loaded from: classes5.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor {
    private static boolean Camera2StreamConfigurationMap;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind> getHighSpeedVideoFpsRangesFor;
    private int[] getOutputMinFrameDuration = null;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI = null;
    private int getHighSpeedVideoSizes = 0;
    private java.lang.String getHighSpeedVideoSizesFor = null;
    private java.lang.String[] getHighSpeedVideoFpsRanges = null;
    private java.lang.String[] getOutputStallDuration = null;
    private java.lang.String[] getInputSizeshNQ4ISI = null;
    private kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind getInputFormats = null;
    private java.lang.String[] getOutputFormats = null;

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }

    static {
        try {
            Camera2StreamConfigurationMap = "true".equals(java.lang.System.getProperty("kotlin.ignore.old.metadata"));
        } catch (java.security.AccessControlException unused) {
            Camera2StreamConfigurationMap = false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.internal.KotlinClass")), kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.internal.KotlinFileFacade")), kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.internal.KotlinMultifileClass")), kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.internal.KotlinSyntheticClass")), kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader createHeaderWithDefaultMetadataVersion() {
        return createHeader(kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.INSTANCE);
    }

    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader createHeader(kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion) {
        int[] iArr;
        if (this.getInputFormats == null || (iArr = this.getOutputMinFrameDuration) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion(iArr, (this.getHighSpeedVideoSizes & 8) != 0);
        if (!metadataVersion2.isCompatible(metadataVersion)) {
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = null;
        } else if ((this.getInputFormats == kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS || this.getInputFormats == kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE || this.getInputFormats == kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) && this.getHighSpeedVideoFpsRanges == null) {
            return null;
        }
        java.lang.String[] strArr = this.getOutputFormats;
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader(this.getInputFormats, metadataVersion2, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getOutputStallDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, strArr != null ? kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding.decodeBytes(strArr) : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind;
        byte b = 0;
        if (classId == null) {
            Camera2StreamConfigurationMap(0);
        }
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(1);
        }
        kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName = classId.asSingleFqName();
        if (asSingleFqName.equals(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.METADATA_FQ_NAME)) {
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinMetadataArgumentVisitor(this, b);
        }
        if (asSingleFqName.equals(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.SERIALIZED_IR_FQ_NAME)) {
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinSerializedIrArgumentVisitor(this, b);
        }
        if (Camera2StreamConfigurationMap || this.getInputFormats != null || (kind = getHighSpeedVideoFpsRangesFor.get(classId)) == null) {
            return null;
        }
        this.getInputFormats = kind;
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.OldDeprecatedAnnotationArgumentVisitor(this, b);
    }

    class KotlinMetadataArgumentVisitor implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        private KotlinMetadataArgumentVisitor() {
        }

        /* synthetic */ KotlinMetadataArgumentVisitor(kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor, byte b) {
            this();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Object obj) {
            if (name2 != null) {
                java.lang.String asString = name2.asString();
                if ("k".equals(asString)) {
                    if (obj instanceof java.lang.Integer) {
                        kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getInputFormats = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.getById(((java.lang.Integer) obj).intValue());
                        return;
                    }
                    return;
                }
                if ("mv".equals(asString)) {
                    if (obj instanceof int[]) {
                        kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getOutputMinFrameDuration = (int[]) obj;
                        return;
                    }
                    return;
                }
                if ("xs".equals(asString)) {
                    if (obj instanceof java.lang.String) {
                        java.lang.String str = (java.lang.String) obj;
                        if (str.isEmpty()) {
                            return;
                        }
                        kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getHighResolutionOutputSizeshNQ4ISI = str;
                        return;
                    }
                    return;
                }
                if ("xi".equals(asString)) {
                    if (obj instanceof java.lang.Integer) {
                        kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getHighSpeedVideoSizes = ((java.lang.Integer) obj).intValue();
                        return;
                    }
                    return;
                }
                if ("pn".equals(asString) && (obj instanceof java.lang.String)) {
                    java.lang.String str2 = (java.lang.String) obj;
                    if (str2.isEmpty()) {
                        return;
                    }
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getHighSpeedVideoSizesFor = str2;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            java.lang.String asString = name2 != null ? name2.asString() : null;
            if (!"d1".equals(asString)) {
                if ("d2".equals(asString)) {
                    return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinMetadataArgumentVisitor.2
                        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                        protected final void getHighSpeedVideoFpsRangesFor(java.lang.String[] strArr) {
                            if (strArr != null) {
                                kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getOutputStallDuration = strArr;
                                return;
                            }
                            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
                        }
                    };
                }
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinMetadataArgumentVisitor.1
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                protected final void getHighSpeedVideoFpsRangesFor(java.lang.String[] strArr) {
                    if (strArr != null) {
                        kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getHighSpeedVideoFpsRanges = strArr;
                        return;
                    }
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.Name name3) {
            if (classId == null) {
                getHighSpeedVideoSizes(1);
            }
            if (name3 == null) {
                getHighSpeedVideoSizes(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                getHighSpeedVideoSizes(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
            if (classId != null) {
                return null;
            }
            getHighSpeedVideoSizes(3);
            return null;
        }

        private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    class OldDeprecatedAnnotationArgumentVisitor implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        private OldDeprecatedAnnotationArgumentVisitor() {
        }

        /* synthetic */ OldDeprecatedAnnotationArgumentVisitor(kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor, byte b) {
            this();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Object obj) {
            if (name2 != null) {
                java.lang.String asString = name2.asString();
                if ("version".equals(asString)) {
                    if (obj instanceof int[]) {
                        kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getOutputMinFrameDuration = (int[]) obj;
                    }
                } else if ("multifileClassName".equals(asString)) {
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getHighResolutionOutputSizeshNQ4ISI = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            java.lang.String asString = name2 != null ? name2.asString() : null;
            if (!com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(asString) && !"filePartClassNames".equals(asString)) {
                if ("strings".equals(asString)) {
                    return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.OldDeprecatedAnnotationArgumentVisitor.2
                        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                        protected final void getHighSpeedVideoFpsRangesFor(java.lang.String[] strArr) {
                            if (strArr != null) {
                                kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getOutputStallDuration = strArr;
                                return;
                            }
                            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
                        }
                    };
                }
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.OldDeprecatedAnnotationArgumentVisitor.1
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                protected final void getHighSpeedVideoFpsRangesFor(java.lang.String[] strArr) {
                    if (strArr != null) {
                        kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getHighSpeedVideoFpsRanges = strArr;
                        return;
                    }
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.Name name3) {
            if (classId == null) {
                getHighSpeedVideoFpsRanges(1);
            }
            if (name3 == null) {
                getHighSpeedVideoFpsRanges(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                getHighSpeedVideoFpsRanges(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
            if (classId != null) {
                return null;
            }
            getHighSpeedVideoFpsRanges(3);
            return null;
        }

        private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    class KotlinSerializedIrArgumentVisitor implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        private KotlinSerializedIrArgumentVisitor() {
        }

        /* synthetic */ KotlinSerializedIrArgumentVisitor(kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor, byte b) {
            this();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            if (util.h.xy.cb.b.f1091.equals(name2 != null ? name2.asString() : null)) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinSerializedIrArgumentVisitor.1
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    protected final void getHighSpeedVideoFpsRangesFor(java.lang.String[] strArr) {
                        if (strArr != null) {
                            kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.this.getOutputFormats = strArr;
                            return;
                        }
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
                    }
                };
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.Name name3) {
            if (classId == null) {
                getHighSpeedVideoSizes(1);
            }
            if (name3 == null) {
                getHighSpeedVideoSizes(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                getHighSpeedVideoSizes(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
            if (classId != null) {
                return null;
            }
            getHighSpeedVideoSizes(3);
            return null;
        }

        private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    static abstract class CollectStringArrayAnnotationVisitor implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {
        private final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

        protected abstract void getHighSpeedVideoFpsRangesFor(java.lang.String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visit(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                this.getHighSpeedVideoFpsRanges.add((java.lang.String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnd() {
            getHighSpeedVideoFpsRangesFor((java.lang.String[]) this.getHighSpeedVideoFpsRanges.toArray(new java.lang.String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnum(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.Name name2) {
            if (classId == null) {
                getHighSpeedVideoFpsRangesFor(0);
            }
            if (name2 == null) {
                getHighSpeedVideoFpsRangesFor(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitClassLiteral(kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                getHighSpeedVideoFpsRangesFor(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
            if (classId != null) {
                return null;
            }
            getHighSpeedVideoFpsRangesFor(3);
            return null;
        }

        private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
