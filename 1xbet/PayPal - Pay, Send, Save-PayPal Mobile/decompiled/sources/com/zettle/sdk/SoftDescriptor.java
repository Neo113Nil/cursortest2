package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/SoftDescriptor;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "descriptor", "Ljava/lang/String;", "getDescriptor", "()Ljava/lang/String;", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SoftDescriptor {
    private final java.lang.String descriptor;

    private SoftDescriptor(java.lang.String str) {
        this.descriptor = str;
    }

    public final java.lang.String getDescriptor() {
        return this.descriptor;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/SoftDescriptor$Builder;", "", "<init>", "()V", "Lcom/zettle/sdk/SoftDescriptor;", "build", "()Lcom/zettle/sdk/SoftDescriptor;", "", "descriptor", "(Ljava/lang/String;)Lcom/zettle/sdk/SoftDescriptor$Builder;", "", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI = 22;
        private java.lang.String getHighSpeedVideoFpsRangesFor;

        public final com.zettle.sdk.SoftDescriptor.Builder descriptor(java.lang.String descriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
            if (descriptor.length() <= this.getHighResolutionOutputSizeshNQ4ISI) {
                java.lang.String str = descriptor;
                if (str.length() != 0) {
                    if (!new kotlin.text.Regex("^[A-Z]+$").matches(str)) {
                        throw new java.lang.IllegalArgumentException("descriptor string must only contain uppercase letters [A-Z]");
                    }
                    this.getHighSpeedVideoFpsRangesFor = descriptor;
                    return this;
                }
            }
            throw new java.lang.IllegalArgumentException("descriptor string must not be empty and length must be at most ".concat(java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI)));
        }

        public final com.zettle.sdk.SoftDescriptor build() {
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            if (str != null) {
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
                if (str == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                }
                return new com.zettle.sdk.SoftDescriptor(str, defaultConstructorMarker);
            }
            throw new java.lang.IllegalStateException("descriptor property must be set");
        }
    }

    public /* synthetic */ SoftDescriptor(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
