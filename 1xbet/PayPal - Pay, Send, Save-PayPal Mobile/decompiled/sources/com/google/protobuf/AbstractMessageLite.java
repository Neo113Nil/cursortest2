package com.google.protobuf;

/* loaded from: classes9.dex */
public abstract class AbstractMessageLite<MessageType extends com.google.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements com.google.protobuf.MessageLite {
    protected int memoizedHashCode = 0;

    protected interface InternalOneOfEnum {
        int getNumber();
    }

    @Override // com.google.protobuf.MessageLite
    public com.google.protobuf.ByteString toByteString() {
        try {
            com.google.protobuf.ByteString.CodedBuilder newCodedBuilder = com.google.protobuf.ByteString.newCodedBuilder(getSerializedSize());
            writeTo(newCodedBuilder.getCodedOutput());
            return newCodedBuilder.build();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            com.google.protobuf.CodedOutputStream newInstance = com.google.protobuf.CodedOutputStream.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        com.google.protobuf.CodedOutputStream newInstance = com.google.protobuf.CodedOutputStream.newInstance(outputStream, com.google.protobuf.CodedOutputStream.computePreferredBufferSize(getSerializedSize()));
        writeTo(newInstance);
        newInstance.flush();
    }

    @Override // com.google.protobuf.MessageLite
    public void writeDelimitedTo(java.io.OutputStream outputStream) throws java.io.IOException {
        int serializedSize = getSerializedSize();
        com.google.protobuf.CodedOutputStream newInstance = com.google.protobuf.CodedOutputStream.newInstance(outputStream, com.google.protobuf.CodedOutputStream.computePreferredBufferSize(com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        newInstance.writeUInt32NoTag(serializedSize);
        writeTo(newInstance);
        newInstance.flush();
    }

    int getMemoizedSerializedSize() {
        throw new java.lang.UnsupportedOperationException();
    }

    void setMemoizedSerializedSize(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    int getSerializedSize(com.google.protobuf.Schema schema) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = schema.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    com.google.protobuf.UninitializedMessageException newUninitializedMessageException() {
        return new com.google.protobuf.UninitializedMessageException(this);
    }

    private java.lang.String getSerializingExceptionMessage(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Serializing ");
        sb.append(getClass().getName());
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public static void checkByteStringIsUtf8(com.google.protobuf.ByteString byteString) throws java.lang.IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new java.lang.IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    @java.lang.Deprecated
    protected static <T> void addAll(java.lang.Iterable<T> iterable, java.util.Collection<? super T> collection) {
        com.google.protobuf.AbstractMessageLite.Builder.addAll((java.lang.Iterable) iterable, (java.util.List) collection);
    }

    public static <T> void addAll(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        com.google.protobuf.AbstractMessageLite.Builder.addAll((java.lang.Iterable) iterable, (java.util.List) list);
    }

    public static abstract class Builder<MessageType extends com.google.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements com.google.protobuf.MessageLite.Builder {
        @Override // 
        /* renamed from: clone */
        public abstract BuilderType mo10571clone();

        protected abstract BuilderType internalMergeFrom(MessageType messagetype);

        @Override // com.google.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return mergeFrom(codedInputStream, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            try {
                com.google.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
                mergeFrom(newCodedInput);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            try {
                com.google.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
                mergeFrom(newCodedInput, extensionRegistryLite);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            try {
                com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(bArr, i, i2);
                mergeFrom(newInstance);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            try {
                com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(bArr, i, i2);
                mergeFrom(newInstance, extensionRegistryLite);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(java.io.InputStream inputStream) throws java.io.IOException {
            com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(inputStream);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(inputStream);
            mergeFrom(newInstance, extensionRegistryLite);
            newInstance.checkLastTagWas(0);
            return this;
        }

        static final class LimitedInputStream extends java.io.FilterInputStream {
            private int limit;

            LimitedInputStream(java.io.InputStream inputStream, int i) {
                super(inputStream);
                this.limit = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws java.io.IOException {
                return java.lang.Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws java.io.IOException {
                if (this.limit <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.limit--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
                int i3 = this.limit;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, java.lang.Math.min(i2, i3));
                if (read >= 0) {
                    this.limit -= read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws java.io.IOException {
                int skip = (int) super.skip(java.lang.Math.min(j, this.limit));
                if (skip >= 0) {
                    this.limit -= skip;
                }
                return skip;
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mergeFrom((java.io.InputStream) new com.google.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, com.google.protobuf.CodedInputStream.readRawVarint32(read, inputStream)), extensionRegistryLite);
            return true;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return mergeDelimitedFrom(inputStream, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.protobuf.MessageLite messageLite) {
            if (!getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            return (BuilderType) internalMergeFrom((com.google.protobuf.AbstractMessageLite) messageLite);
        }

        private java.lang.String getReadingExceptionMessage(java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Reading ");
            sb.append(getClass().getName());
            sb.append(" from a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            return sb.toString();
        }

        private static <T> void addAllCheckingNulls(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
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

        protected static com.google.protobuf.UninitializedMessageException newUninitializedMessageException(com.google.protobuf.MessageLite messageLite) {
            return new com.google.protobuf.UninitializedMessageException(messageLite);
        }

        @java.lang.Deprecated
        protected static <T> void addAll(java.lang.Iterable<T> iterable, java.util.Collection<? super T> collection) {
            addAll((java.lang.Iterable) iterable, (java.util.List) collection);
        }

        protected static <T> void addAll(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
            com.google.protobuf.Internal.checkNotNull(iterable);
            if (iterable instanceof com.google.protobuf.LazyStringList) {
                java.util.List<?> underlyingElements = ((com.google.protobuf.LazyStringList) iterable).getUnderlyingElements();
                com.google.protobuf.LazyStringList lazyStringList = (com.google.protobuf.LazyStringList) list;
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
                    if (obj instanceof com.google.protobuf.ByteString) {
                        lazyStringList.add((com.google.protobuf.ByteString) obj);
                    } else {
                        lazyStringList.add((java.lang.String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof com.google.protobuf.PrimitiveNonBoxingCollection) {
                list.addAll((java.util.Collection) iterable);
            } else {
                addAllCheckingNulls(iterable, list);
            }
        }
    }
}
