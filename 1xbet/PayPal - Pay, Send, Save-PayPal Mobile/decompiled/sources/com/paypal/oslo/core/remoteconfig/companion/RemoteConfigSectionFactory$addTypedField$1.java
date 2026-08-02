package com.paypal.oslo.core.remoteconfig.companion;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RemoteConfigSectionFactory$addTypedField$1<T> implements kotlin.jvm.functions.Function1<com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<T>, kotlin.Unit> {
    final /* synthetic */ T getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
        invoke((com.paypal.oslo.core.companion.domain.ConfigFieldBuilder) obj);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<T> configFieldBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
        configFieldBuilder.name(this.getHighSpeedVideoFpsRangesFor.getDisplayName());
        java.lang.String str = this.getHighSpeedVideoSizes;
        java.lang.String description = this.getHighSpeedVideoFpsRangesFor.getDescription();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(description);
        configFieldBuilder.description(sb.toString());
        com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver = configFieldBuilder.getResolver();
        java.lang.Object defaultValue = resolver != null ? resolver.defaultValue(this.getHighSpeedVideoFpsRangesFor.getFullKey(), null) : null;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        if (defaultValue == null) {
            defaultValue = this.getHighSpeedVideoFpsRanges;
        }
        configFieldBuilder.value(defaultValue);
    }

    public RemoteConfigSectionFactory$addTypedField$1(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry remoteConfigEntry, java.lang.String str, T t) {
        this.getHighSpeedVideoFpsRangesFor = remoteConfigEntry;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = t;
    }
}
