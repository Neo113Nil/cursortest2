package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public abstract class GeneratedMessageLite extends kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite implements java.io.Serializable {

    public interface ExtendableMessageOrBuilder<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage> extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    protected void makeExtensionsImmutable() {
    }

    public GeneratedMessageLite() {
    }

    public GeneratedMessageLite(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public kotlin.reflect.jvm.internal.impl.protobuf.Parser<? extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> getParserForType() {
        throw new java.lang.UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
        return codedInputStream.skipField(i, codedOutputStream);
    }

    public static abstract class Builder<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, BuilderType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder> extends kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder<BuilderType> {
        private kotlin.reflect.jvm.internal.impl.protobuf.ByteString getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract MessageType getDefaultInstanceForType();

        public abstract BuilderType mergeFrom(MessageType messagetype);

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public BuilderType mo23897clone() {
            throw new java.lang.UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getUnknownFields() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final BuilderType setUnknownFields(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
            this.getHighResolutionOutputSizeshNQ4ISI = byteString;
            return this;
        }
    }

    public static abstract class ExtendableMessage<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>> extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType> {
        private final kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> Camera2StreamConfigurationMap;

        public ExtendableMessage() {
            this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.Camera2StreamConfigurationMap();
        }

        public ExtendableMessage(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, ?> extendableBuilder) {
            this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder.getHighSpeedVideoFpsRanges(extendableBuilder);
        }

        protected boolean extensionsAreInitialized() {
            return this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
            return kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, getDefaultInstanceForType(), codedInputStream, codedOutputStream, extensionRegistryLite, i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected void makeExtensionsImmutable() {
            kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.Camera2StreamConfigurationMap;
            if (fieldSet.getHighSpeedVideoSizes) {
                return;
            }
            fieldSet.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
            fieldSet.getHighSpeedVideoSizes = true;
        }

        public class ExtensionWriter {
            private final boolean Camera2StreamConfigurationMap;
            private final java.util.Iterator<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> getHighResolutionOutputSizeshNQ4ISI;
            private java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> getHighSpeedVideoFpsRangesFor;

            /* synthetic */ ExtensionWriter(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage extendableMessage) {
                this(false);
            }

            private ExtensionWriter(boolean z) {
                java.util.Iterator<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> it;
                kotlin.reflect.jvm.internal.impl.protobuf.FieldSet fieldSet = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.this.Camera2StreamConfigurationMap;
                if (fieldSet.Camera2StreamConfigurationMap) {
                    it = new kotlin.reflect.jvm.internal.impl.protobuf.LazyField.LazyIterator<>(fieldSet.getHighResolutionOutputSizeshNQ4ISI.entrySet().iterator());
                } else {
                    it = fieldSet.getHighResolutionOutputSizeshNQ4ISI.entrySet().iterator();
                }
                this.getHighResolutionOutputSizeshNQ4ISI = it;
                if (it.hasNext()) {
                    this.getHighSpeedVideoFpsRangesFor = it.next();
                }
                this.Camera2StreamConfigurationMap = false;
            }

            public void writeUntil(int i, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                while (true) {
                    java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> entry = this.getHighSpeedVideoFpsRangesFor;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor key = this.getHighSpeedVideoFpsRangesFor.getKey();
                    if (this.Camera2StreamConfigurationMap && key.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(key.getNumber(), (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) this.getHighSpeedVideoFpsRangesFor.getValue());
                    } else {
                        kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.Camera2StreamConfigurationMap(key, this.getHighSpeedVideoFpsRangesFor.getValue(), codedOutputStream);
                    }
                    if (this.getHighResolutionOutputSizeshNQ4ISI.hasNext()) {
                        this.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.next();
                    } else {
                        this.getHighSpeedVideoFpsRangesFor = null;
                    }
                }
            }
        }

        protected kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter() {
            return new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
        }

        protected int extensionsSerializedSize() {
            kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.Camera2StreamConfigurationMap;
            int i = 0;
            for (int i2 = 0; i2 < fieldSet.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.size(); i2++) {
                kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, java.lang.Object>.Entry entry = fieldSet.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.get(i2);
                i += kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<?>) entry.getKey(), entry.getValue());
            }
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> smallSortedMap = fieldSet.getHighResolutionOutputSizeshNQ4ISI;
            for (java.util.Map.Entry entry2 : smallSortedMap.getHighSpeedVideoSizes.isEmpty() ? kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.getHighSpeedVideoSizes() : smallSortedMap.getHighSpeedVideoSizes.entrySet()) {
                i += kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<?>) entry2.getKey(), entry2.getValue());
            }
            return i;
        }

        /* JADX WARN: Type inference failed for: r1v7, types: [Type, java.util.ArrayList, java.util.List] */
        public final <Type> Type getExtension(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, Type> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.Camera2StreamConfigurationMap;
                java.lang.Object obj = (Type) fieldSet.getHighResolutionOutputSizeshNQ4ISI.get(generatedExtension.getHighSpeedVideoSizes);
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
                    obj = (Type) ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj).getValue();
                }
                if (obj == null) {
                    return generatedExtension.getHighResolutionOutputSizeshNQ4ISI;
                }
                if (generatedExtension.getHighSpeedVideoSizes.isRepeated()) {
                    if (generatedExtension.getHighSpeedVideoSizes.getLiteJavaType() != kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM) {
                        return (Type) obj;
                    }
                    ?? r1 = (Type) new java.util.ArrayList();
                    java.util.Iterator it = ((java.util.List) obj).iterator();
                    while (it.hasNext()) {
                        r1.add(generatedExtension.getHighSpeedVideoFpsRanges(it.next()));
                    }
                    return r1;
                }
                return (Type) generatedExtension.getHighSpeedVideoFpsRanges(obj);
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public final <Type> Type getExtension(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, java.util.List<Type>> generatedExtension, int i) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.Camera2StreamConfigurationMap;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.getHighSpeedVideoSizes;
                if (!extensionDescriptor.isRepeated()) {
                    throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
                }
                java.lang.Object obj = fieldSet.getHighResolutionOutputSizeshNQ4ISI.get(extensionDescriptor);
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
                    obj = ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj).getValue();
                }
                if (obj != null) {
                    return (Type) generatedExtension.getHighSpeedVideoFpsRanges(((java.util.List) obj).get(i));
                }
                throw new java.lang.IndexOutOfBoundsException();
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public final <Type> int getExtensionCount(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, java.util.List<Type>> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.Camera2StreamConfigurationMap;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.getHighSpeedVideoSizes;
                if (!extensionDescriptor.isRepeated()) {
                    throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
                }
                java.lang.Object obj = fieldSet.getHighResolutionOutputSizeshNQ4ISI.get(extensionDescriptor);
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
                    obj = ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj).getValue();
                }
                if (obj == null) {
                    return 0;
                }
                return ((java.util.List) obj).size();
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public final <Type> boolean hasExtension(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, Type> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.Camera2StreamConfigurationMap;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.getHighSpeedVideoSizes;
                if (extensionDescriptor.isRepeated()) {
                    throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
                }
                return fieldSet.getHighResolutionOutputSizeshNQ4ISI.get(extensionDescriptor) != null;
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>, BuilderType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType> implements kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType> {
        private kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.getHighSpeedVideoFpsRanges();
        private boolean getHighSpeedVideoSizes;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public BuilderType mo23897clone() {
            throw new java.lang.UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        protected boolean extensionsAreInitialized() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.FieldSet getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder) {
            kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableBuilder.getHighResolutionOutputSizeshNQ4ISI;
            if (!fieldSet.getHighSpeedVideoSizes) {
                fieldSet.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
                fieldSet.getHighSpeedVideoSizes = true;
            }
            extendableBuilder.getHighSpeedVideoSizes = false;
            return extendableBuilder.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final <Type> BuilderType addExtension(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, java.util.List<Type>> generatedExtension, Type type) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            if (!this.getHighSpeedVideoSizes) {
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.clone();
                this.getHighSpeedVideoSizes = true;
            }
            kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.getHighSpeedVideoSizes;
            if (generatedExtension.getHighSpeedVideoSizes.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM) {
                type = (Type) java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) type).getNumber());
            }
            fieldSet.getHighSpeedVideoSizes(extensionDescriptor, type);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected final void mergeExtensionFields(MessageType messagetype) {
            if (!this.getHighSpeedVideoSizes) {
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.clone();
                this.getHighSpeedVideoSizes = true;
            }
            kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.reflect.jvm.internal.impl.protobuf.FieldSet fieldSet2 = ((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage) messagetype).Camera2StreamConfigurationMap;
            for (int i = 0; i < fieldSet2.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.size(); i++) {
                fieldSet.Camera2StreamConfigurationMap(fieldSet2.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.get(i));
            }
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> smallSortedMap = fieldSet2.getHighResolutionOutputSizeshNQ4ISI;
            java.util.Iterator it = (smallSortedMap.getHighSpeedVideoSizes.isEmpty() ? kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.getHighSpeedVideoSizes() : smallSortedMap.getHighSpeedVideoSizes.entrySet()).iterator();
            while (it.hasNext()) {
                fieldSet.Camera2StreamConfigurationMap((java.util.Map.Entry) it.next());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List] */
        public final <Type> BuilderType setExtension(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, Type> generatedExtension, Type type) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            if (!this.getHighSpeedVideoSizes) {
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.clone();
                this.getHighSpeedVideoSizes = true;
            }
            kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.getHighSpeedVideoSizes;
            if (generatedExtension.getHighSpeedVideoSizes.isRepeated()) {
                if (generatedExtension.getHighSpeedVideoSizes.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM) {
                    Type arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : (java.util.List) type) {
                        if (generatedExtension.getHighSpeedVideoSizes.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM) {
                            obj = java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) obj).getNumber());
                        }
                        arrayList.add(obj);
                    }
                    type = arrayList;
                }
            } else if (generatedExtension.getHighSpeedVideoSizes.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM) {
                type = (Type) java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) type).getNumber());
            }
            fieldSet.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor>) extensionDescriptor, type);
            return this;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static <ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, Type> kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, java.lang.Class cls) {
        return new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingtype, type, messageLite, new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumLiteMap, i, fieldType, false, false), cls);
    }

    public static <ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, Type> kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, boolean z, java.lang.Class cls) {
        return new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingtype, java.util.Collections.emptyList(), messageLite, new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumLiteMap, i, fieldType, true, z), cls);
    }

    static final class ExtensionDescriptor implements kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
        final kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<?> Camera2StreamConfigurationMap;
        final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        final boolean getHighSpeedVideoSizes;

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
            return this.getHighSpeedVideoFpsRanges - ((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor) obj).getHighSpeedVideoFpsRanges;
        }

        ExtensionDescriptor(kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.Camera2StreamConfigurationMap = enumLiteMap;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighResolutionOutputSizeshNQ4ISI = fieldType;
            this.getHighSpeedVideoSizes = z;
            this.getHighSpeedVideoFpsRangesFor = z2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final int getNumber() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType getLiteType() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType getLiteJavaType() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isRepeated() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isPacked() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder internalMergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
            return ((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) builder).mergeFrom((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite) messageLite);
        }
    }

    static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException e) {
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.String.valueOf(cls.getName()));
            java.lang.String valueOf2 = java.lang.String.valueOf(java.lang.String.valueOf(str));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(valueOf.length() + 45 + valueOf2.length());
            sb.append("Generated message class \"");
            sb.append(valueOf);
            sb.append("\" missing method \"");
            sb.append(valueOf2);
            sb.append("\".");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    static java.lang.Object Camera2StreamConfigurationMap(java.lang.reflect.Method method, java.lang.Object... objArr) {
        try {
            return method.invoke(null, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static class GeneratedExtension<ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, Type> {
        final ContainingType Camera2StreamConfigurationMap;
        final Type getHighResolutionOutputSizeshNQ4ISI;
        final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getHighSpeedVideoFpsRanges;
        final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
        final kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor getHighSpeedVideoSizes;
        final java.lang.Class getOutputFormats;

        GeneratedExtension(ContainingType containingtype, Type type, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor, java.lang.Class cls) {
            if (containingtype == null) {
                throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.getLiteType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.MESSAGE && messageLite == null) {
                throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
            }
            this.Camera2StreamConfigurationMap = containingtype;
            this.getHighResolutionOutputSizeshNQ4ISI = type;
            this.getHighSpeedVideoFpsRanges = messageLite;
            this.getHighSpeedVideoSizes = extensionDescriptor;
            this.getOutputFormats = cls;
            if (kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.getHighResolutionOutputSizeshNQ4ISI(cls, "valueOf", java.lang.Integer.TYPE);
            } else {
                this.getHighSpeedVideoFpsRangesFor = null;
            }
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.Camera2StreamConfigurationMap;
        }

        public int getNumber() {
            return this.getHighSpeedVideoSizes.getNumber();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getMessageDefaultInstance() {
            return this.getHighSpeedVideoFpsRanges;
        }

        final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Object obj) {
            return this.getHighSpeedVideoSizes.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM ? kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, (java.lang.Integer) obj) : obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /* JADX WARN: Type inference failed for: r9v15, types: [kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet fieldSet, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
        boolean z;
        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder;
        java.lang.Object build;
        int highResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getHighResolutionOutputSizeshNQ4ISI(i);
        int tagFieldNumber = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getTagFieldNumber(i);
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messageLite, tagFieldNumber);
        if (findLiteExtensionByNumber != null) {
            z = false;
            if (highResolutionOutputSizeshNQ4ISI == kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.Camera2StreamConfigurationMap(findLiteExtensionByNumber.getHighSpeedVideoSizes.getLiteType(), false)) {
                tagFieldNumber = 0;
            } else if (findLiteExtensionByNumber.getHighSpeedVideoSizes.getHighSpeedVideoSizes && findLiteExtensionByNumber.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.isPackable() && highResolutionOutputSizeshNQ4ISI == kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.Camera2StreamConfigurationMap(findLiteExtensionByNumber.getHighSpeedVideoSizes.getLiteType(), true)) {
                tagFieldNumber = 1;
            }
            if (!z) {
                return codedInputStream.skipField(i, codedOutputStream);
            }
            if (tagFieldNumber != 0) {
                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                if (findLiteExtensionByNumber.getHighSpeedVideoSizes.getLiteType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM) {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        java.lang.Object findValueByNumber = findLiteExtensionByNumber.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.findValueByNumber(codedInputStream.readEnum());
                        if (findValueByNumber == 0) {
                            break;
                        }
                        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = findLiteExtensionByNumber.getHighSpeedVideoSizes;
                        if (findLiteExtensionByNumber.getHighSpeedVideoSizes.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM) {
                            findValueByNumber = java.lang.Integer.valueOf(findValueByNumber.getNumber());
                        }
                        fieldSet.getHighSpeedVideoSizes(extensionDescriptor, findValueByNumber);
                    }
                } else {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.getHighSpeedVideoSizes, kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.getHighSpeedVideoFpsRangesFor(codedInputStream, findLiteExtensionByNumber.getHighSpeedVideoSizes.getLiteType()));
                    }
                }
                codedInputStream.popLimit(pushLimit);
            } else {
                int i2 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AnonymousClass1.getHighSpeedVideoSizes[findLiteExtensionByNumber.getHighSpeedVideoSizes.getLiteJavaType().ordinal()];
                if (i2 == 1) {
                    if (!findLiteExtensionByNumber.getHighSpeedVideoSizes.isRepeated()) {
                        java.lang.Object obj = fieldSet.getHighResolutionOutputSizeshNQ4ISI.get(findLiteExtensionByNumber.getHighSpeedVideoSizes);
                        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
                            obj = ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj).getValue();
                        }
                        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite2 = (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj;
                        if (messageLite2 != null) {
                            builder = messageLite2.toBuilder();
                            if (builder == null) {
                                builder = findLiteExtensionByNumber.getMessageDefaultInstance().newBuilderForType();
                            }
                            if (findLiteExtensionByNumber.getHighSpeedVideoSizes.getLiteType() != kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP) {
                                codedInputStream.readGroup(findLiteExtensionByNumber.getNumber(), builder, extensionRegistryLite);
                            } else {
                                codedInputStream.readMessage(builder, extensionRegistryLite);
                            }
                            build = builder.build();
                        }
                    }
                    builder = null;
                    if (builder == null) {
                    }
                    if (findLiteExtensionByNumber.getHighSpeedVideoSizes.getLiteType() != kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP) {
                    }
                    build = builder.build();
                } else if (i2 == 2) {
                    int readEnum = codedInputStream.readEnum();
                    java.lang.Object findValueByNumber2 = findLiteExtensionByNumber.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.findValueByNumber(readEnum);
                    if (findValueByNumber2 == null) {
                        codedOutputStream.writeRawVarint32(i);
                        codedOutputStream.writeUInt32NoTag(readEnum);
                    } else {
                        build = findValueByNumber2;
                    }
                } else {
                    build = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.getHighSpeedVideoFpsRangesFor(codedInputStream, findLiteExtensionByNumber.getHighSpeedVideoSizes.getLiteType());
                }
                if (findLiteExtensionByNumber.getHighSpeedVideoSizes.isRepeated()) {
                    kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor2 = findLiteExtensionByNumber.getHighSpeedVideoSizes;
                    if (findLiteExtensionByNumber.getHighSpeedVideoSizes.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM) {
                        build = java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) build).getNumber());
                    }
                    fieldSet.getHighSpeedVideoSizes(extensionDescriptor2, build);
                } else {
                    kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor3 = findLiteExtensionByNumber.getHighSpeedVideoSizes;
                    if (findLiteExtensionByNumber.getHighSpeedVideoSizes.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM) {
                        build = java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) build).getNumber());
                    }
                    fieldSet.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet) extensionDescriptor3, build);
                }
            }
            return true;
        }
        z = true;
        if (!z) {
        }
    }
}
