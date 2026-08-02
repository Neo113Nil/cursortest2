package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract class AbstractMessageLite<MessageType extends androidx.content.preferences.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements androidx.content.preferences.protobuf.MessageLite {
    protected int memoizedHashCode = 0;

    /* loaded from: classes7.dex */
    protected interface InternalOneOfEnum {
        int getNumber();
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public androidx.content.preferences.protobuf.ByteString toByteString() {
        try {
            androidx.datastore.preferences.protobuf.ByteString.CodedBuilder highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoFpsRanges(getSerializedSize());
            writeTo(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges);
            highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.checkNoSpaceLeft();
            return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(highSpeedVideoFpsRanges.Camera2StreamConfigurationMap);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(getHighSpeedVideoFpsRanges("ByteString"), e);
        }
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            androidx.content.preferences.protobuf.CodedOutputStream newInstance = androidx.content.preferences.protobuf.CodedOutputStream.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(getHighSpeedVideoFpsRanges("byte array"), e);
        }
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        androidx.content.preferences.protobuf.CodedOutputStream newInstance = androidx.content.preferences.protobuf.CodedOutputStream.newInstance(outputStream, androidx.content.preferences.protobuf.CodedOutputStream.getHighSpeedVideoFpsRangesFor(getSerializedSize()));
        writeTo(newInstance);
        newInstance.flush();
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public void writeDelimitedTo(java.io.OutputStream outputStream) throws java.io.IOException {
        int serializedSize = getSerializedSize();
        androidx.content.preferences.protobuf.CodedOutputStream newInstance = androidx.content.preferences.protobuf.CodedOutputStream.newInstance(outputStream, androidx.content.preferences.protobuf.CodedOutputStream.getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        newInstance.writeUInt32NoTag(serializedSize);
        writeTo(newInstance);
        newInstance.flush();
    }

    int getHighSpeedVideoFpsRangesFor() {
        throw new java.lang.UnsupportedOperationException();
    }

    void getHighSpeedVideoFpsRanges(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    int getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Schema schema) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor != -1) {
            return highSpeedVideoFpsRangesFor;
        }
        int highSpeedVideoSizes = schema.getHighSpeedVideoSizes(this);
        getHighSpeedVideoFpsRanges(highSpeedVideoSizes);
        return highSpeedVideoSizes;
    }

    androidx.content.preferences.protobuf.UninitializedMessageException getHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.content.preferences.protobuf.UninitializedMessageException(this);
    }

    private java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Serializing ");
        sb.append(getClass().getName());
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    protected static void checkByteStringIsUtf8(androidx.content.preferences.protobuf.ByteString byteString) throws java.lang.IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new java.lang.IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public static <T> void addAll(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.addAll((java.lang.Iterable) iterable, (java.util.List) list);
    }

    public static abstract class Builder<MessageType extends androidx.content.preferences.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements androidx.datastore.preferences.protobuf.MessageLite.Builder {
        @Override // 
        /* renamed from: clone */
        public abstract BuilderType mo9148clone();

        protected abstract BuilderType internalMergeFrom(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return mergeFrom(codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            try {
                androidx.content.preferences.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
                mergeFrom(newCodedInput);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getHighSpeedVideoFpsRanges("ByteString"), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            try {
                androidx.content.preferences.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
                mergeFrom(newCodedInput, extensionRegistryLite);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getHighSpeedVideoFpsRanges("ByteString"), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            try {
                androidx.content.preferences.protobuf.CodedInputStream newInstance = androidx.content.preferences.protobuf.CodedInputStream.newInstance(bArr, i, i2);
                mergeFrom(newInstance);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getHighSpeedVideoFpsRanges("byte array"), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            try {
                androidx.content.preferences.protobuf.CodedInputStream newInstance = androidx.content.preferences.protobuf.CodedInputStream.newInstance(bArr, i, i2);
                mergeFrom(newInstance, extensionRegistryLite);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getHighSpeedVideoFpsRanges("byte array"), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(java.io.InputStream inputStream) throws java.io.IOException {
            androidx.content.preferences.protobuf.CodedInputStream newInstance = androidx.content.preferences.protobuf.CodedInputStream.newInstance(inputStream);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            androidx.content.preferences.protobuf.CodedInputStream newInstance = androidx.content.preferences.protobuf.CodedInputStream.newInstance(inputStream);
            mergeFrom(newInstance, extensionRegistryLite);
            newInstance.checkLastTagWas(0);
            return this;
        }

        /* loaded from: classes7.dex */
        static final class LimitedInputStream extends java.io.FilterInputStream {
            private int getHighSpeedVideoFpsRanges;

            LimitedInputStream(java.io.InputStream inputStream, int i) {
                super(inputStream);
                this.getHighSpeedVideoFpsRanges = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws java.io.IOException {
                return java.lang.Math.min(super.available(), this.getHighSpeedVideoFpsRanges);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws java.io.IOException {
                if (this.getHighSpeedVideoFpsRanges <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.getHighSpeedVideoFpsRanges--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
                int i3 = this.getHighSpeedVideoFpsRanges;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, java.lang.Math.min(i2, i3));
                if (read >= 0) {
                    this.getHighSpeedVideoFpsRanges -= read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws java.io.IOException {
                int skip = (int) super.skip(java.lang.Math.min(j, this.getHighSpeedVideoFpsRanges));
                if (skip >= 0) {
                    this.getHighSpeedVideoFpsRanges -= skip;
                }
                return skip;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mergeFrom((java.io.InputStream) new androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, androidx.content.preferences.protobuf.CodedInputStream.readRawVarint32(read, inputStream)), extensionRegistryLite);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return mergeDelimitedFrom(inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(androidx.content.preferences.protobuf.MessageLite messageLite) {
            if (!getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            return (BuilderType) internalMergeFrom((androidx.content.preferences.protobuf.AbstractMessageLite) messageLite);
        }

        private java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Reading ");
            sb.append(getClass().getName());
            sb.append(" from a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            return sb.toString();
        }

        private static <T> void getHighSpeedVideoFpsRanges(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
            if ((list instanceof java.util.ArrayList) && (iterable instanceof java.util.Collection)) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + ((java.util.Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Element at index ");
                    sb.append(list.size() - size);
                    sb.append(" is null.");
                    java.lang.String obj = sb.toString();
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new java.lang.NullPointerException(obj);
                }
                list.add(t);
            }
        }

        protected static androidx.content.preferences.protobuf.UninitializedMessageException newUninitializedMessageException(androidx.content.preferences.protobuf.MessageLite messageLite) {
            return new androidx.content.preferences.protobuf.UninitializedMessageException(messageLite);
        }

        @java.lang.Deprecated
        protected static <T> void addAll(java.lang.Iterable<T> iterable, java.util.Collection<? super T> collection) {
            addAll((java.lang.Iterable) iterable, (java.util.List) collection);
        }

        protected static <T> void addAll(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
            androidx.content.preferences.protobuf.Internal.Camera2StreamConfigurationMap(iterable);
            if (iterable instanceof androidx.content.preferences.protobuf.LazyStringList) {
                java.util.List<?> underlyingElements = ((androidx.content.preferences.protobuf.LazyStringList) iterable).getUnderlyingElements();
                androidx.content.preferences.protobuf.LazyStringList lazyStringList = (androidx.content.preferences.protobuf.LazyStringList) list;
                int size = list.size();
                for (java.lang.Object obj : underlyingElements) {
                    if (obj == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Element at index ");
                        sb.append(lazyStringList.size() - size);
                        sb.append(" is null.");
                        java.lang.String obj2 = sb.toString();
                        for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                            lazyStringList.remove(size2);
                        }
                        throw new java.lang.NullPointerException(obj2);
                    }
                    if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
                        lazyStringList.add((androidx.content.preferences.protobuf.ByteString) obj);
                    } else if (obj instanceof byte[]) {
                        lazyStringList.add(androidx.content.preferences.protobuf.ByteString.copyFrom((byte[]) obj));
                    } else {
                        lazyStringList.add((java.lang.String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof androidx.content.preferences.protobuf.PrimitiveNonBoxingCollection) {
                list.addAll((java.util.Collection) iterable);
            } else {
                getHighSpeedVideoFpsRanges(iterable, list);
            }
        }
    }
}
