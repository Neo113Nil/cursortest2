package com.goldenboot.saga.zone;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@ReceiverAdministrator
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/goldenboot/saga/zone/WrapperHub;", "Lcom/goldenboot/saga/zone/BundleList;", "Lcom/goldenboot/saga/zone/InterpolatorHook;", "fontFamily", "<init>", "(Lcom/goldenboot/saga/zone/InterpolatorHook;)V", "Lcom/goldenboot/saga/zone/CardReducer;", "fontWeight", "Lcom/goldenboot/saga/zone/ProgressMutator;", "fontStyle", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "injectMetric", "(Lcom/goldenboot/saga/zone/CardReducer;I)Landroid/graphics/Typeface;", "Lcom/goldenboot/saga/zone/InputHerald;", "synthesis", "growPayload", "(Lcom/goldenboot/saga/zone/CardReducer;II)Landroid/graphics/Typeface;", "Lcom/goldenboot/saga/zone/FeatureConverter;", "evictLayout", "Lcom/goldenboot/saga/zone/FeatureConverter;", "()Lcom/goldenboot/saga/zone/FeatureConverter;", "Landroid/graphics/Typeface;", "nativeTypeface", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WrapperHub implements BundleList {
    public static final int injectMetric = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final FeatureConverter fontFamily;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final Typeface nativeTypeface;

    public WrapperHub(InterpolatorHook interpolatorHook) {
        this.fontFamily = interpolatorHook;
        Typeface create = Typeface.create(interpolatorHook.getName(), 0);
        Intrinsics.checkNotNull(create);
        this.nativeTypeface = create;
    }

    private final Typeface injectMetric(FontWeight fontWeight, int fontStyle) {
        return VibrationDownloader.evictLayout.evictLayout(this.nativeTypeface, fontWeight.getWeight(), ProgressMutator.clipOrigin(fontStyle, ProgressMutator.INSTANCE.evictLayout()));
    }

    @Override // com.goldenboot.saga.zone.CursorSplitter
    /* renamed from: evictLayout, reason: from getter */
    public FeatureConverter getFontFamily() {
        return this.fontFamily;
    }

    @Override // com.goldenboot.saga.zone.BundleList
    public Typeface growPayload(FontWeight fontWeight, int fontStyle, int synthesis) {
        return injectMetric(fontWeight, fontStyle);
    }
}
