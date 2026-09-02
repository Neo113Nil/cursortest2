package com.goldenboot.saga.zone;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class BridgeEncoder implements Comparable, Serializable {
    public final long notifyMessage;
    public final long reduceScope;
    public static final ActivityMutator connectPatch = new ActivityMutator(null);
    public static final BridgeEncoder attachConfig = new BridgeEncoder(0, 0);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ActivityMutator() {
        }
    }

    public BridgeEncoder(long j, long j2) {
        this.reduceScope = j;
        this.notifyMessage = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeEncoder)) {
            return false;
        }
        BridgeEncoder bridgeEncoder = (BridgeEncoder) obj;
        return this.reduceScope == bridgeEncoder.reduceScope && this.notifyMessage == bridgeEncoder.notifyMessage;
    }

    @Override // java.lang.Comparable
    /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
    public int compareTo(BridgeEncoder other) {
        Intrinsics.checkNotNullParameter(other, "other");
        long j = this.reduceScope;
        return j != other.reduceScope ? Long.compareUnsigned(BoxSlot.evictLayout(j), BoxSlot.evictLayout(other.reduceScope)) : Long.compareUnsigned(BoxSlot.evictLayout(this.notifyMessage), BoxSlot.evictLayout(other.notifyMessage));
    }

    public int hashCode() {
        return Long.hashCode(this.reduceScope ^ this.notifyMessage);
    }

    public final String releaseHeader() {
        byte[] bArr = new byte[36];
        IconSender.evictLayout(this.reduceScope, bArr, 0, 0, 4);
        bArr[8] = 45;
        IconSender.evictLayout(this.reduceScope, bArr, 9, 4, 6);
        bArr[13] = 45;
        IconSender.evictLayout(this.reduceScope, bArr, 14, 6, 8);
        bArr[18] = 45;
        IconSender.evictLayout(this.notifyMessage, bArr, 19, 0, 2);
        bArr[23] = 45;
        IconSender.evictLayout(this.notifyMessage, bArr, 24, 2, 8);
        return HapticDecoder.attachConfig(bArr);
    }

    public String toString() {
        return releaseHeader();
    }
}
