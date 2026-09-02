package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/goldenboot/saga/zone/CarouselExecutor;", "Lcom/goldenboot/saga/zone/TypographyCompiler;", "", "verbatim", "<init>", "(Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "growPayload", "Ljava/lang/String;", "evictLayout", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.CarouselExecutor, reason: from toString */
/* loaded from: classes.dex */
public final class VerbatimTtsAnnotation extends TypographyCompiler {
    public static final int injectMetric = 0;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final String verbatim;

    public VerbatimTtsAnnotation(String str) {
        super(null);
        this.verbatim = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VerbatimTtsAnnotation) && Intrinsics.areEqual(this.verbatim, ((VerbatimTtsAnnotation) other).verbatim);
    }

    /* renamed from: evictLayout, reason: from getter */
    public final String getVerbatim() {
        return this.verbatim;
    }

    public int hashCode() {
        return this.verbatim.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.verbatim + ')';
    }
}
