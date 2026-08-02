package androidx.preference;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/preference/PreferenceGroupKt$iterator$1;", "", "Landroidx/preference/Preference;", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Landroidx/preference/Preference;", "", "remove", "()V", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0})
/* loaded from: classes7.dex */
public final class PreferenceGroupKt$iterator$1 implements java.util.Iterator<androidx.preference.Preference>, kotlin.jvm.internal.markers.KMutableIterator {
    final /* synthetic */ androidx.preference.PreferenceGroup getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    PreferenceGroupKt$iterator$1(androidx.preference.PreferenceGroup preferenceGroup) {
        this.getHighSpeedVideoFpsRanges = preferenceGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Camera2StreamConfigurationMap < this.getHighSpeedVideoFpsRanges.getPreferenceCount();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final androidx.preference.Preference next() {
        androidx.preference.PreferenceGroup preferenceGroup = this.getHighSpeedVideoFpsRanges;
        int i = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i + 1;
        androidx.preference.Preference preference = preferenceGroup.getPreference(i);
        if (preference != null) {
            return preference;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        androidx.preference.PreferenceGroup preferenceGroup = this.getHighSpeedVideoFpsRanges;
        int i = this.Camera2StreamConfigurationMap - 1;
        this.Camera2StreamConfigurationMap = i;
        preferenceGroup.removePreference(preferenceGroup.getPreference(i));
    }
}
