package androidx.camera.camera2.interop;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ%\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/camera/camera2/interop/CaptureRequestOptions;", "Landroidx/camera/core/impl/ReadableConfig;", "Landroidx/camera/core/impl/Config;", "p0", "", "p1", "<init>", "(Landroidx/camera/core/impl/Config;B)V", "config", "(Landroidx/camera/core/impl/Config;)V", "ValueT", "Landroid/hardware/camera2/CaptureRequest$Key;", "key", "getCaptureRequestOption", "(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;", "valueIfMissing", "getCaptureRequestOption$camera_camera2", "(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Ljava/lang/Object;", "getConfig", "()Landroidx/camera/core/impl/Config;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/Config;", "getHighSpeedVideoFpsRanges", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CaptureRequestOptions implements androidx.camera.core.impl.ReadableConfig {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.impl.Config getHighSpeedVideoFpsRanges;

    private CaptureRequestOptions(androidx.camera.core.impl.Config config, byte b) {
        this.getHighSpeedVideoFpsRanges = config;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptureRequestOptions(androidx.camera.core.impl.Config config) {
        this(config, (byte) 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ValueT> ValueT getCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        androidx.camera.core.impl.Config.Option<java.lang.Object> createCaptureRequestOption = androidx.camera.camera2.impl.Camera2ImplConfigKt.createCaptureRequestOption(key);
        kotlin.jvm.internal.Intrinsics.checkNotNull(createCaptureRequestOption, "");
        return (ValueT) this.getHighSpeedVideoFpsRanges.retrieveOption(createCaptureRequestOption, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <ValueT> ValueT getCaptureRequestOption$camera_camera2(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valueIfMissing) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        androidx.camera.core.impl.Config.Option<java.lang.Object> createCaptureRequestOption = androidx.camera.camera2.impl.Camera2ImplConfigKt.createCaptureRequestOption(key);
        kotlin.jvm.internal.Intrinsics.checkNotNull(createCaptureRequestOption, "");
        return (ValueT) this.getHighSpeedVideoFpsRanges.retrieveOption(createCaptureRequestOption, valueIfMissing);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    /* renamed from: getConfig, reason: from getter */
    public androidx.camera.core.impl.Config getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u00070\u0012¢\u0006\u0002\b\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;", "Landroidx/camera/core/ExtendableBuilder;", "Landroidx/camera/camera2/interop/CaptureRequestOptions;", "<init>", "()V", "Landroidx/camera/core/impl/MutableConfig;", "getMutableConfig", "()Landroidx/camera/core/impl/MutableConfig;", "ValueT", "Landroid/hardware/camera2/CaptureRequest$Key;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setCaptureRequestOption", "(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;", "clearCaptureRequestOption", "(Landroid/hardware/camera2/CaptureRequest$Key;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;", "build", "()Landroidx/camera/camera2/interop/CaptureRequestOptions;", "Landroidx/camera/core/impl/MutableOptionsBundle;", "Lorg/jspecify/annotations/NonNull;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/core/impl/MutableOptionsBundle;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Builder implements androidx.camera.core.ExtendableBuilder<androidx.camera.camera2.interop.CaptureRequestOptions> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.interop.CaptureRequestOptions.Builder.Companion INSTANCE = new androidx.camera.camera2.interop.CaptureRequestOptions.Builder.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.camera.core.impl.MutableOptionsBundle getHighResolutionOutputSizeshNQ4ISI;

        public Builder() {
            androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            this.getHighResolutionOutputSizeshNQ4ISI = create;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder$Companion;", "", "<init>", "()V", "Landroidx/camera/core/impl/Config;", "config", "Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;", "from", "(Landroidx/camera/core/impl/Config;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.camera.camera2.interop.CaptureRequestOptions.Builder from(final androidx.camera.core.impl.Config config) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
                final androidx.camera.camera2.interop.CaptureRequestOptions.Builder builder = new androidx.camera.camera2.interop.CaptureRequestOptions.Builder();
                config.findOptions(androidx.camera.camera2.impl.Camera2ImplConfig.CAPTURE_REQUEST_ID_STEM, new androidx.camera.core.impl.Config.OptionMatcher() { // from class: androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0
                    @Override // androidx.camera.core.impl.Config.OptionMatcher
                    public final boolean onOptionMatched(androidx.camera.core.impl.Config.Option option) {
                        return androidx.camera.camera2.interop.CaptureRequestOptions.Builder.Companion.m147$r8$lambda$TpTyfsqJK_4iZRe960dG48bmbo(androidx.camera.camera2.interop.CaptureRequestOptions.Builder.this, config, option);
                    }
                });
                return builder;
            }

            /* renamed from: $r8$lambda$Tp-TyfsqJK_4iZRe960dG48bmbo, reason: not valid java name */
            public static /* synthetic */ boolean m147$r8$lambda$TpTyfsqJK_4iZRe960dG48bmbo(androidx.camera.camera2.interop.CaptureRequestOptions.Builder builder, androidx.camera.core.impl.Config config, androidx.camera.core.impl.Config.Option option) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
                builder.getMutableConfig().insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
                return true;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <ValueT> androidx.camera.camera2.interop.CaptureRequestOptions.Builder setCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.getHighResolutionOutputSizeshNQ4ISI.insertOption(androidx.camera.camera2.impl.Camera2ImplConfigKt.createCaptureRequestOption(key), value);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <ValueT> androidx.camera.camera2.interop.CaptureRequestOptions.Builder clearCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.getHighResolutionOutputSizeshNQ4ISI.removeOption(androidx.camera.camera2.impl.Camera2ImplConfigKt.createCaptureRequestOption(key));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.camera2.interop.CaptureRequestOptions build() {
            androidx.camera.core.impl.OptionsBundle from = androidx.camera.core.impl.OptionsBundle.from(this.getHighResolutionOutputSizeshNQ4ISI);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
            return new androidx.camera.camera2.interop.CaptureRequestOptions(from);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.camera.camera2.interop.CaptureRequestOptions.Builder from(androidx.camera.core.impl.Config config) {
            return INSTANCE.from(config);
        }
    }
}
