package com.google.protobuf;

/* loaded from: classes4.dex */
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
    public void writeTo(final java.io.OutputStream output) throws java.io.IOException {
        com.google.protobuf.CodedOutputStream newInstance = com.google.protobuf.CodedOutputStream.newInstance(output, com.google.protobuf.CodedOutputStream.computePreferredBufferSize(getSerializedSize()));
        writeTo(newInstance);
        newInstance.flush();
    }

    @Override // com.google.protobuf.MessageLite
    public void writeDelimitedTo(final java.io.OutputStream output) throws java.io.IOException {
        int serializedSize = getSerializedSize();
        com.google.protobuf.CodedOutputStream newInstance = com.google.protobuf.CodedOutputStream.newInstance(output, com.google.protobuf.CodedOutputStream.computePreferredBufferSize(com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        newInstance.writeUInt32NoTag(serializedSize);
        writeTo(newInstance);
        newInstance.flush();
    }

    int getMemoizedSerializedSize() {
        throw new java.lang.UnsupportedOperationException();
    }

    void setMemoizedSerializedSize(int size) {
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

    private java.lang.String getSerializingExceptionMessage(java.lang.String target) {
        return "Serializing " + getClass().getName() + " to a " + target + " threw an IOException (should never happen).";
    }

    protected static void checkByteStringIsUtf8(com.google.protobuf.ByteString byteString) throws java.lang.IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new java.lang.IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    @java.lang.Deprecated
    protected static <T> void addAll(final java.lang.Iterable<T> values, final java.util.Collection<? super T> list) {
        com.google.protobuf.AbstractMessageLite.Builder.addAll((java.lang.Iterable) values, (java.util.List) list);
    }

    protected static <T> void addAll(final java.lang.Iterable<T> values, final java.util.List<? super T> list) {
        com.google.protobuf.AbstractMessageLite.Builder.addAll((java.lang.Iterable) values, (java.util.List) list);
    }

    public static abstract class Builder<MessageType extends com.google.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements com.google.protobuf.MessageLite.Builder {
        @Override // 
        /* renamed from: clone */
        public abstract BuilderType mo5595clone();

        protected abstract BuilderType internalMergeFrom(MessageType message);

        @Override // com.google.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(final com.google.protobuf.CodedInputStream input, final com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return mergeFrom(input, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            try {
                com.google.protobuf.CodedInputStream newCodedInput = data.newCodedInput();
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
        public BuilderType mergeFrom(final com.google.protobuf.ByteString data, final com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            try {
                com.google.protobuf.CodedInputStream newCodedInput = data.newCodedInput();
                mergeFrom(newCodedInput, extensionRegistry);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return mergeFrom(data, 0, data.length);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final byte[] data, final int off, final int len) throws com.google.protobuf.InvalidProtocolBufferException {
            try {
                com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(data, off, len);
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
        public BuilderType mergeFrom(final byte[] data, final com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return mergeFrom(data, 0, data.length, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final byte[] data, final int off, final int len, final com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            try {
                com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(data, off, len);
                mergeFrom(newInstance, extensionRegistry);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final java.io.InputStream input) throws java.io.IOException {
            com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(input);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final java.io.InputStream input, final com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(input);
            mergeFrom(newInstance, extensionRegistry);
            newInstance.checkLastTagWas(0);
            return this;
        }

        static final class LimitedInputStream extends java.io.FilterInputStream {
            private int limit;

            LimitedInputStream(java.io.InputStream in, int limit) {
                super(in);
                this.limit = limit;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws java.io.IOException {
                return java.lang.Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws java.io.IOException {
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
            public int read(final byte[] b, final int off, int len) throws java.io.IOException {
                int i = this.limit;
                if (i <= 0) {
                    return -1;
                }
                int read = super.read(b, off, java.lang.Math.min(len, i));
                if (read >= 0) {
                    this.limit -= read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(final long n) throws java.io.IOException {
                int skip = (int) super.skip(java.lang.Math.min(n, this.limit));
                if (skip >= 0) {
                    this.limit -= skip;
                }
                return skip;
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(final java.io.InputStream input, final com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int read = input.read();
            if (read == -1) {
                return false;
            }
            mergeFrom((java.io.InputStream) new com.google.protobuf.AbstractMessageLite.Builder.LimitedInputStream(input, com.google.protobuf.CodedInputStream.readRawVarint32(read, input)), extensionRegistry);
            return true;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(final java.io.InputStream input) throws java.io.IOException {
            return mergeDelimitedFrom(input, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.protobuf.MessageLite messageLite) {
            if (!getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            return (BuilderType) internalMergeFrom((com.google.protobuf.AbstractMessageLite) messageLite);
        }

        private java.lang.String getReadingExceptionMessage(java.lang.String target) {
            return "Reading " + getClass().getName() + " from a " + target + " threw an IOException (should never happen).";
        }

        private static <T> void addAllCheckingNulls(java.lang.Iterable<T> values, java.util.List<? super T> list) {
            if ((list instanceof java.util.ArrayList) && (values instanceof java.util.Collection)) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + ((java.util.Collection) values).size());
            }
            int size = list.size();
            for (T t : values) {
                if (t == null) {
                    java.lang.String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new java.lang.NullPointerException(str);
                }
                list.add(t);
            }
        }

        protected static com.google.protobuf.UninitializedMessageException newUninitializedMessageException(com.google.protobuf.MessageLite message) {
            return new com.google.protobuf.UninitializedMessageException(message);
        }

        @java.lang.Deprecated
        protected static <T> void addAll(final java.lang.Iterable<T> values, final java.util.Collection<? super T> list) {
            addAll((java.lang.Iterable) values, (java.util.List) list);
        }

        protected static <T> void addAll(final java.lang.Iterable<T> values, final java.util.List<? super T> list) {
            com.google.protobuf.Internal.checkNotNull(values);
            if (values instanceof com.google.protobuf.LazyStringList) {
                java.util.List<?> underlyingElements = ((com.google.protobuf.LazyStringList) values).getUnderlyingElements();
                com.google.protobuf.LazyStringList lazyStringList = (com.google.protobuf.LazyStringList) list;
                int size = list.size();
                for (java.lang.Object obj : underlyingElements) {
                    if (obj == null) {
                        java.lang.String str = "Element at index " + (lazyStringList.size() - size) + " is null.";
                        for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                            lazyStringList.remove(size2);
                        }
                        throw new java.lang.NullPointerException(str);
                    }
                    if (obj instanceof com.google.protobuf.ByteString) {
                        lazyStringList.add((com.google.protobuf.ByteString) obj);
                    } else {
                        lazyStringList.add((java.lang.String) obj);
                    }
                }
                return;
            }
            if (values instanceof com.google.protobuf.PrimitiveNonBoxingCollection) {
                list.addAll((java.util.Collection) values);
            } else {
                addAllCheckingNulls(values, list);
            }
        }
    }
}
