package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public abstract class AbstractMessageLite implements kotlin.reflect.jvm.internal.impl.protobuf.MessageLite {
    protected int memoizedHashCode = 0;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public void writeDelimitedTo(java.io.OutputStream outputStream) throws java.io.IOException {
        int serializedSize = getSerializedSize();
        kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(outputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeRawVarint32Size(serializedSize) + serializedSize));
        newInstance.writeRawVarint32(serializedSize);
        writeTo(newInstance);
        newInstance.flush();
    }

    public static abstract class Builder<BuilderType extends kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder> implements kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder {
        @Override // 
        /* renamed from: clone */
        public abstract BuilderType mo23897clone();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        static final class LimitedInputStream extends java.io.FilterInputStream {
            private int getHighResolutionOutputSizeshNQ4ISI;

            LimitedInputStream(java.io.InputStream inputStream, int i) {
                super(inputStream);
                this.getHighResolutionOutputSizeshNQ4ISI = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws java.io.IOException {
                return java.lang.Math.min(super.available(), this.getHighResolutionOutputSizeshNQ4ISI);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws java.io.IOException {
                if (this.getHighResolutionOutputSizeshNQ4ISI <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
                int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, java.lang.Math.min(i2, i3));
                if (read >= 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI -= read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws java.io.IOException {
                long skip = super.skip(java.lang.Math.min(j, this.getHighResolutionOutputSizeshNQ4ISI));
                if (skip >= 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (int) (this.getHighResolutionOutputSizeshNQ4ISI - skip);
                }
                return skip;
            }
        }

        protected static kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException newUninitializedMessageException(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
            return new kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException(messageLite);
        }

        public static <T> void addAll(java.lang.Iterable<T> iterable, java.util.Collection<? super T> collection) {
            if (!(iterable instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList)) {
                if (!(iterable instanceof java.util.Collection)) {
                    java.util.Iterator<T> it = iterable.iterator();
                    while (it.hasNext()) {
                        collection.add(it.next());
                    }
                    return;
                } else {
                    java.util.Iterator<T> it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    collection.addAll((java.util.Collection) iterable);
                    return;
                }
            }
            java.util.Iterator<T> it3 = ((kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList) iterable).getUnderlyingElements().iterator();
            while (it3.hasNext()) {
                it3.next();
            }
            collection.addAll((java.util.Collection) iterable);
        }
    }
}
