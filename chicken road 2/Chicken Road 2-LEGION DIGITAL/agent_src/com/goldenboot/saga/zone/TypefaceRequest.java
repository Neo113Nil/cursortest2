package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b'\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010\u0015¨\u0006*"}, d2 = {"Lcom/goldenboot/saga/zone/DpadPipeline;", "", "Lcom/goldenboot/saga/zone/FeatureConverter;", "fontFamily", "Lcom/goldenboot/saga/zone/CardReducer;", "fontWeight", "Lcom/goldenboot/saga/zone/ProgressMutator;", "fontStyle", "Lcom/goldenboot/saga/zone/InputHerald;", "fontSynthesis", "resourceLoaderCacheKey", "<init>", "(Lcom/goldenboot/saga/zone/FeatureConverter;Lcom/goldenboot/saga/zone/CardReducer;IILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "evictLayout", "()Lcom/goldenboot/saga/zone/FeatureConverter;", "growPayload", "()Lcom/goldenboot/saga/zone/CardReducer;", "injectMetric", "()I", "detachStream", "releaseHeader", "()Ljava/lang/Object;", "clipOrigin", "(Lcom/goldenboot/saga/zone/FeatureConverter;Lcom/goldenboot/saga/zone/CardReducer;IILjava/lang/Object;)Lcom/goldenboot/saga/zone/DpadPipeline;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/goldenboot/saga/zone/FeatureConverter;", "updateTimer", "Lcom/goldenboot/saga/zone/CardReducer;", "drawField", "I", "applyTask", "popBlueprint", "Ljava/lang/Object;", "connectJob", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.DpadPipeline, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class TypefaceRequest {
    public static final int clipOrigin = 8;

    /* renamed from: detachStream, reason: from kotlin metadata and from toString */
    private final int fontSynthesis;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final FeatureConverter fontFamily;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final int fontStyle;

    /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(FeatureConverter featureConverter, FontWeight fontWeight, int i, int i2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureConverter, fontWeight, i, i2, obj);
    }

    public static /* synthetic */ TypefaceRequest flushSample(TypefaceRequest typefaceRequest, FeatureConverter featureConverter, FontWeight fontWeight, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            featureConverter = typefaceRequest.fontFamily;
        }
        if ((i3 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        if ((i3 & 4) != 0) {
            i = typefaceRequest.fontStyle;
        }
        if ((i3 & 8) != 0) {
            i2 = typefaceRequest.fontSynthesis;
        }
        if ((i3 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        Object obj3 = obj;
        int i4 = i;
        return typefaceRequest.clipOrigin(featureConverter, fontWeight, i4, i2, obj3);
    }

    /* renamed from: applyTask, reason: from getter */
    public final int getFontStyle() {
        return this.fontStyle;
    }

    public final TypefaceRequest clipOrigin(FeatureConverter fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis, Object resourceLoaderCacheKey) {
        return new TypefaceRequest(fontFamily, fontWeight, fontStyle, fontSynthesis, resourceLoaderCacheKey, null);
    }

    /* renamed from: connectJob, reason: from getter */
    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    /* renamed from: detachStream, reason: from getter */
    public final int getFontSynthesis() {
        return this.fontSynthesis;
    }

    /* renamed from: drawField, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) other;
        return Intrinsics.areEqual(this.fontFamily, typefaceRequest.fontFamily) && Intrinsics.areEqual(this.fontWeight, typefaceRequest.fontWeight) && ProgressMutator.clipOrigin(this.fontStyle, typefaceRequest.fontStyle) && InputHerald.updateTimer(this.fontSynthesis, typefaceRequest.fontSynthesis) && Intrinsics.areEqual(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    /* renamed from: evictLayout, reason: from getter */
    public final FeatureConverter getFontFamily() {
        return this.fontFamily;
    }

    public final FontWeight growPayload() {
        return this.fontWeight;
    }

    public int hashCode() {
        FeatureConverter featureConverter = this.fontFamily;
        int hashCode = (((((((featureConverter == null ? 0 : featureConverter.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + ProgressMutator.updateTimer(this.fontStyle)) * 31) + InputHerald.applyTask(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final int injectMetric() {
        return this.fontStyle;
    }

    public final int popBlueprint() {
        return this.fontSynthesis;
    }

    public final Object releaseHeader() {
        return this.resourceLoaderCacheKey;
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) ProgressMutator.applyTask(this.fontStyle)) + ", fontSynthesis=" + ((Object) InputHerald.connectJob(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    public final FeatureConverter updateTimer() {
        return this.fontFamily;
    }

    private TypefaceRequest(FeatureConverter featureConverter, FontWeight fontWeight, int i, int i2, Object obj) {
        this.fontFamily = featureConverter;
        this.fontWeight = fontWeight;
        this.fontStyle = i;
        this.fontSynthesis = i2;
        this.resourceLoaderCacheKey = obj;
    }
}
