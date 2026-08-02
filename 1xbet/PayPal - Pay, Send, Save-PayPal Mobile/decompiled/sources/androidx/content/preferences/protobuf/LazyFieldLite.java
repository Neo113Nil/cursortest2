package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public class LazyFieldLite {
    private androidx.content.preferences.protobuf.ExtensionRegistryLite getHighResolutionOutputSizeshNQ4ISI;
    private volatile androidx.content.preferences.protobuf.ByteString getHighSpeedVideoFpsRanges;
    private androidx.content.preferences.protobuf.ByteString getHighSpeedVideoFpsRangesFor;
    protected volatile androidx.content.preferences.protobuf.MessageLite value;

    public int hashCode() {
        return 1;
    }

    public LazyFieldLite(androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.content.preferences.protobuf.ByteString byteString) {
        if (extensionRegistryLite == null) {
            throw new java.lang.NullPointerException("found null ExtensionRegistry");
        }
        if (byteString != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = extensionRegistryLite;
            this.getHighSpeedVideoFpsRangesFor = byteString;
            return;
        }
        throw new java.lang.NullPointerException("found null ByteString");
    }

    public LazyFieldLite() {
    }

    public static androidx.content.preferences.protobuf.LazyFieldLite fromValue(androidx.content.preferences.protobuf.MessageLite messageLite) {
        androidx.content.preferences.protobuf.LazyFieldLite lazyFieldLite = new androidx.content.preferences.protobuf.LazyFieldLite();
        lazyFieldLite.setValue(messageLite);
        return lazyFieldLite;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.content.preferences.protobuf.LazyFieldLite)) {
            return false;
        }
        androidx.content.preferences.protobuf.LazyFieldLite lazyFieldLite = (androidx.content.preferences.protobuf.LazyFieldLite) obj;
        androidx.content.preferences.protobuf.MessageLite messageLite = this.value;
        androidx.content.preferences.protobuf.MessageLite messageLite2 = lazyFieldLite.value;
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
        if (this.getHighSpeedVideoFpsRanges == androidx.content.preferences.protobuf.ByteString.EMPTY) {
            return true;
        }
        if (this.value != null) {
            return false;
        }
        androidx.content.preferences.protobuf.ByteString byteString = this.getHighSpeedVideoFpsRangesFor;
        return byteString == null || byteString == androidx.content.preferences.protobuf.ByteString.EMPTY;
    }

    public void clear() {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.value = null;
        this.getHighSpeedVideoFpsRanges = null;
    }

    public void set(androidx.content.preferences.protobuf.LazyFieldLite lazyFieldLite) {
        this.getHighSpeedVideoFpsRangesFor = lazyFieldLite.getHighSpeedVideoFpsRangesFor;
        this.value = lazyFieldLite.value;
        this.getHighSpeedVideoFpsRanges = lazyFieldLite.getHighSpeedVideoFpsRanges;
        androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite = lazyFieldLite.getHighResolutionOutputSizeshNQ4ISI;
        if (extensionRegistryLite != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = extensionRegistryLite;
        }
    }

    public androidx.content.preferences.protobuf.MessageLite getValue(androidx.content.preferences.protobuf.MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public androidx.content.preferences.protobuf.MessageLite setValue(androidx.content.preferences.protobuf.MessageLite messageLite) {
        androidx.content.preferences.protobuf.MessageLite messageLite2 = this.value;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.value = messageLite;
        return messageLite2;
    }

    public void merge(androidx.content.preferences.protobuf.LazyFieldLite lazyFieldLite) {
        androidx.content.preferences.protobuf.ByteString byteString;
        if (lazyFieldLite.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(lazyFieldLite);
            return;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = lazyFieldLite.getHighResolutionOutputSizeshNQ4ISI;
        }
        androidx.content.preferences.protobuf.ByteString byteString2 = this.getHighSpeedVideoFpsRangesFor;
        if (byteString2 != null && (byteString = lazyFieldLite.getHighSpeedVideoFpsRangesFor) != null) {
            this.getHighSpeedVideoFpsRangesFor = byteString2.concat(byteString);
            return;
        }
        if (this.value == null && lazyFieldLite.value != null) {
            setValue(getHighResolutionOutputSizeshNQ4ISI(lazyFieldLite.value, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI));
        } else if (this.value != null && lazyFieldLite.value == null) {
            setValue(getHighResolutionOutputSizeshNQ4ISI(this.value, lazyFieldLite.getHighSpeedVideoFpsRangesFor, lazyFieldLite.getHighResolutionOutputSizeshNQ4ISI));
        } else {
            setValue(this.value.toBuilder().mergeFrom(lazyFieldLite.value).build());
        }
    }

    public void mergeFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        if (containsDefaultInstance()) {
            setByteString(codedInputStream.readBytes(), extensionRegistryLite);
            return;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = extensionRegistryLite;
        }
        androidx.content.preferences.protobuf.ByteString byteString = this.getHighSpeedVideoFpsRangesFor;
        if (byteString != null) {
            setByteString(byteString.concat(codedInputStream.readBytes()), this.getHighResolutionOutputSizeshNQ4ISI);
        } else {
            try {
                setValue(this.value.toBuilder().mergeFrom(codedInputStream, extensionRegistryLite).build());
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException unused) {
            }
        }
    }

    private static androidx.content.preferences.protobuf.MessageLite getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        try {
            return messageLite.toBuilder().mergeFrom(byteString, extensionRegistryLite).build();
        } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException unused) {
            return messageLite;
        }
    }

    public void setByteString(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == null) {
            throw new java.lang.NullPointerException("found null ExtensionRegistry");
        }
        if (byteString != null) {
            this.getHighSpeedVideoFpsRangesFor = byteString;
            this.getHighResolutionOutputSizeshNQ4ISI = extensionRegistryLite;
            this.value = null;
            this.getHighSpeedVideoFpsRanges = null;
            return;
        }
        throw new java.lang.NullPointerException("found null ByteString");
    }

    public int getSerializedSize() {
        if (this.getHighSpeedVideoFpsRanges != null) {
            return this.getHighSpeedVideoFpsRanges.size();
        }
        androidx.content.preferences.protobuf.ByteString byteString = this.getHighSpeedVideoFpsRangesFor;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public androidx.content.preferences.protobuf.ByteString toByteString() {
        if (this.getHighSpeedVideoFpsRanges != null) {
            return this.getHighSpeedVideoFpsRanges;
        }
        androidx.content.preferences.protobuf.ByteString byteString = this.getHighSpeedVideoFpsRangesFor;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges != null) {
                return this.getHighSpeedVideoFpsRanges;
            }
            if (this.value == null) {
                this.getHighSpeedVideoFpsRanges = androidx.content.preferences.protobuf.ByteString.EMPTY;
            } else {
                this.getHighSpeedVideoFpsRanges = this.value.toByteString();
            }
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    protected void ensureInitialized(androidx.content.preferences.protobuf.MessageLite messageLite) {
        if (this.value == null) {
            synchronized (this) {
                if (this.value != null) {
                    return;
                }
                try {
                    if (this.getHighSpeedVideoFpsRangesFor != null) {
                        this.value = messageLite.getParserForType().parseFrom(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
                        this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor;
                    } else {
                        this.value = messageLite;
                        this.getHighSpeedVideoFpsRanges = androidx.content.preferences.protobuf.ByteString.EMPTY;
                    }
                } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException unused) {
                    this.value = messageLite;
                    this.getHighSpeedVideoFpsRanges = androidx.content.preferences.protobuf.ByteString.EMPTY;
                }
            }
        }
    }
}
