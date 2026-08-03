package com.google.protobuf;

/* loaded from: classes4.dex */
public class LazyFieldLite {
    private static final com.google.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry();
    private com.google.protobuf.ByteString delayedBytes;
    private com.google.protobuf.ExtensionRegistryLite extensionRegistry;
    private volatile com.google.protobuf.ByteString memoizedBytes;
    protected volatile com.google.protobuf.MessageLite value;

    public int hashCode() {
        return 1;
    }

    public LazyFieldLite(com.google.protobuf.ExtensionRegistryLite extensionRegistry, com.google.protobuf.ByteString bytes) {
        checkArguments(extensionRegistry, bytes);
        this.extensionRegistry = extensionRegistry;
        this.delayedBytes = bytes;
    }

    public LazyFieldLite() {
    }

    public static com.google.protobuf.LazyFieldLite fromValue(com.google.protobuf.MessageLite value) {
        com.google.protobuf.LazyFieldLite lazyFieldLite = new com.google.protobuf.LazyFieldLite();
        lazyFieldLite.setValue(value);
        return lazyFieldLite;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof com.google.protobuf.LazyFieldLite)) {
            return false;
        }
        com.google.protobuf.LazyFieldLite lazyFieldLite = (com.google.protobuf.LazyFieldLite) o;
        com.google.protobuf.MessageLite messageLite = this.value;
        com.google.protobuf.MessageLite messageLite2 = lazyFieldLite.value;
        if (messageLite == null && messageLite2 == null) {
            return toByteString().equals(lazyFieldLite.toByteString());
        }
        if (messageLite != null && messageLite2 != null) {
            return messageLite.equals(messageLite2);
        }
        if (messageLite != null) {
            return messageLite.equals(lazyFieldLite.getValue(messageLite.getDefaultInstanceForType()));
        }
        return getValue(messageLite2.getDefaultInstanceForType()).equals(messageLite2);
    }

    public boolean containsDefaultInstance() {
        com.google.protobuf.ByteString byteString;
        return this.memoizedBytes == com.google.protobuf.ByteString.EMPTY || (this.value == null && ((byteString = this.delayedBytes) == null || byteString == com.google.protobuf.ByteString.EMPTY));
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public void set(com.google.protobuf.LazyFieldLite other) {
        this.delayedBytes = other.delayedBytes;
        this.value = other.value;
        this.memoizedBytes = other.memoizedBytes;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite = other.extensionRegistry;
        if (extensionRegistryLite != null) {
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    public com.google.protobuf.MessageLite getValue(com.google.protobuf.MessageLite defaultInstance) {
        ensureInitialized(defaultInstance);
        return this.value;
    }

    public com.google.protobuf.MessageLite setValue(com.google.protobuf.MessageLite value) {
        com.google.protobuf.MessageLite messageLite = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = value;
        return messageLite;
    }

    public void merge(com.google.protobuf.LazyFieldLite other) {
        com.google.protobuf.ByteString byteString;
        if (other.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(other);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = other.extensionRegistry;
        }
        com.google.protobuf.ByteString byteString2 = this.delayedBytes;
        if (byteString2 != null && (byteString = other.delayedBytes) != null) {
            this.delayedBytes = byteString2.concat(byteString);
            return;
        }
        if (this.value == null && other.value != null) {
            setValue(mergeValueAndBytes(other.value, this.delayedBytes, this.extensionRegistry));
        } else if (this.value != null && other.value == null) {
            setValue(mergeValueAndBytes(this.value, other.delayedBytes, other.extensionRegistry));
        } else {
            setValue(this.value.toBuilder().mergeFrom(other.value).build());
        }
    }

    public void mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        if (containsDefaultInstance()) {
            setByteString(input.readBytes(), extensionRegistry);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = extensionRegistry;
        }
        com.google.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            setByteString(byteString.concat(input.readBytes()), this.extensionRegistry);
        } else {
            try {
                setValue(this.value.toBuilder().mergeFrom(input, extensionRegistry).build());
            } catch (com.google.protobuf.InvalidProtocolBufferException unused) {
            }
        }
    }

    private static com.google.protobuf.MessageLite mergeValueAndBytes(com.google.protobuf.MessageLite value, com.google.protobuf.ByteString otherBytes, com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
        try {
            return value.toBuilder().mergeFrom(otherBytes, extensionRegistry).build();
        } catch (com.google.protobuf.InvalidProtocolBufferException unused) {
            return value;
        }
    }

    public void setByteString(com.google.protobuf.ByteString bytes, com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
        checkArguments(extensionRegistry, bytes);
        this.delayedBytes = bytes;
        this.extensionRegistry = extensionRegistry;
        this.value = null;
        this.memoizedBytes = null;
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        com.google.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public com.google.protobuf.ByteString toByteString() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        com.google.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.memoizedBytes != null) {
                return this.memoizedBytes;
            }
            if (this.value == null) {
                this.memoizedBytes = com.google.protobuf.ByteString.EMPTY;
            } else {
                this.memoizedBytes = this.value.toByteString();
            }
            return this.memoizedBytes;
        }
    }

    void writeTo(com.google.protobuf.Writer writer, int fieldNumber) throws java.io.IOException {
        if (this.memoizedBytes != null) {
            writer.writeBytes(fieldNumber, this.memoizedBytes);
            return;
        }
        com.google.protobuf.ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            writer.writeBytes(fieldNumber, byteString);
        } else if (this.value != null) {
            writer.writeMessage(fieldNumber, this.value);
        } else {
            writer.writeBytes(fieldNumber, com.google.protobuf.ByteString.EMPTY);
        }
    }

    protected void ensureInitialized(com.google.protobuf.MessageLite defaultInstance) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.delayedBytes != null) {
                    this.value = defaultInstance.getParserForType().parseFrom(this.delayedBytes, this.extensionRegistry);
                    this.memoizedBytes = this.delayedBytes;
                } else {
                    this.value = defaultInstance;
                    this.memoizedBytes = com.google.protobuf.ByteString.EMPTY;
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException unused) {
                this.value = defaultInstance;
                this.memoizedBytes = com.google.protobuf.ByteString.EMPTY;
            }
        }
    }

    private static void checkArguments(com.google.protobuf.ExtensionRegistryLite extensionRegistry, com.google.protobuf.ByteString bytes) {
        if (extensionRegistry == null) {
            throw new java.lang.NullPointerException("found null ExtensionRegistry");
        }
        if (bytes == null) {
            throw new java.lang.NullPointerException("found null ByteString");
        }
    }
}
