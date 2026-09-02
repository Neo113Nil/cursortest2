package com.goldenboot.saga.zone;

import android.content.Context;
import android.graphics.Typeface;
import com.goldenboot.saga.zone.SharedMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH ¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d\"\u0004\b\u001b\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010!\u0082\u0001\u0003#$%¨\u0006&"}, d2 = {"Lcom/goldenboot/saga/zone/MorphDemux;", "Lcom/goldenboot/saga/zone/LifecycleBackup;", "Lcom/goldenboot/saga/zone/CardReducer;", "weight", "Lcom/goldenboot/saga/zone/ProgressMutator;", "style", "Lcom/goldenboot/saga/zone/SharedMonitor$EndpointList;", "variationSettings", "<init>", "(Lcom/goldenboot/saga/zone/CardReducer;ILcom/goldenboot/saga/zone/SharedMonitor$EndpointList;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "clipOrigin", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "applyTask", "flushSample", "Lcom/goldenboot/saga/zone/CardReducer;", "growPayload", "()Lcom/goldenboot/saga/zone/CardReducer;", "updateTimer", "I", "injectMetric", "()I", "", "Z", "didInitWithContext", "popBlueprint", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "(Landroid/graphics/Typeface;)V", "typeface", "", "()Ljava/lang/String;", "cacheKey", "Lcom/goldenboot/saga/zone/InputCollection;", "Lcom/goldenboot/saga/zone/RippleBus;", "Lcom/goldenboot/saga/zone/PipelineCollection;", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class MorphDemux extends LifecycleBackup {
    public static final int drawField = 0;

    /* renamed from: applyTask, reason: from kotlin metadata */
    private boolean didInitWithContext;

    /* renamed from: flushSample, reason: from kotlin metadata */
    private final FontWeight weight;

    /* renamed from: popBlueprint, reason: from kotlin metadata */
    private Typeface typeface;

    /* renamed from: updateTimer, reason: from kotlin metadata */
    private final int style;

    public /* synthetic */ MorphDemux(FontWeight fontWeight, int i, SharedMonitor.EndpointList endpointList, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontWeight, i, endpointList);
    }

    public final Typeface applyTask(Context context) {
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = clipOrigin(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    public abstract Typeface clipOrigin(Context context);

    public abstract String flushSample();

    @Override // com.goldenboot.saga.zone.AlarmHook
    /* renamed from: growPayload, reason: from getter */
    public final FontWeight getWeight() {
        return this.weight;
    }

    @Override // com.goldenboot.saga.zone.AlarmHook
    /* renamed from: injectMetric, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    public final void popBlueprint(Typeface typeface) {
        this.typeface = typeface;
    }

    /* renamed from: updateTimer, reason: from getter */
    public final Typeface getTypeface() {
        return this.typeface;
    }

    private MorphDemux(FontWeight fontWeight, int i, SharedMonitor.EndpointList endpointList) {
        super(NativeArbitrator.INSTANCE.growPayload(), ReceiverFence.evictLayout, endpointList, null);
        this.weight = fontWeight;
        this.style = i;
    }
}
