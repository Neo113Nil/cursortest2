package com.unity3d.ads.core.data.datasource;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "", "<init>", "()V", "MuteChange", "VolumeChange", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange$MuteChange;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange$VolumeChange;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class VolumeSettingsChange {
    public /* synthetic */ VolumeSettingsChange(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange$MuteChange;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "isMuted", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MuteChange extends VolumeSettingsChange {
        private final boolean isMuted;

        public static /* synthetic */ MuteChange copy$default(MuteChange muteChange, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = muteChange.isMuted;
            }
            return muteChange.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsMuted() {
            return this.isMuted;
        }

        public final MuteChange copy(boolean isMuted) {
            return new MuteChange(isMuted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MuteChange) && this.isMuted == ((MuteChange) other).isMuted;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMuted);
        }

        public String toString() {
            return "MuteChange(isMuted=" + this.isMuted + ')';
        }

        public MuteChange(boolean z) {
            super(null);
            this.isMuted = z;
        }

        public final boolean isMuted() {
            return this.isMuted;
        }
    }

    private VolumeSettingsChange() {
    }

    /* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange$VolumeChange;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "volume", "", "<init>", "(D)V", "getVolume", "()D", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VolumeChange extends VolumeSettingsChange {
        private final double volume;

        public static /* synthetic */ VolumeChange copy$default(VolumeChange volumeChange, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = volumeChange.volume;
            }
            return volumeChange.copy(d);
        }

        /* renamed from: component1, reason: from getter */
        public final double getVolume() {
            return this.volume;
        }

        public final VolumeChange copy(double volume) {
            return new VolumeChange(volume);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VolumeChange) && Double.compare(this.volume, ((VolumeChange) other).volume) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.volume);
        }

        public String toString() {
            return "VolumeChange(volume=" + this.volume + ')';
        }

        public VolumeChange(double d) {
            super(null);
            this.volume = d;
        }

        public final double getVolume() {
            return this.volume;
        }
    }
}
