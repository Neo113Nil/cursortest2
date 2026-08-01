package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OfferwallShowEvent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "", "<init>", "()V", "Show", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class OfferwallShowEvent {
    public /* synthetic */ OfferwallShowEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: OfferwallShowEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Show extends OfferwallShowEvent {
        public static final Show INSTANCE = new Show();

        private Show() {
            super(null);
        }
    }

    private OfferwallShowEvent() {
    }
}
