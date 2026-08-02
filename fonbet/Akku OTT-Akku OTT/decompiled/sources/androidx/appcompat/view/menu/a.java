package androidx.appcompat.view.menu;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.util.Consumer;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer, Bundleable.Creator, ObjectConstructor {
    public static Object a(int i, List list) {
        return list.get(list.size() - i);
    }

    public static String b(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String c(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.util.Consumer
    public void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRestored();
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Collection lambda$newCollectionConstructor$10;
        lambda$newCollectionConstructor$10 = ConstructorConstructor.lambda$newCollectionConstructor$10();
        return lambda$newCollectionConstructor$10;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        DefaultTrackSelector.Parameters lambda$static$0;
        lambda$static$0 = DefaultTrackSelector.Parameters.lambda$static$0(bundle);
        return lambda$static$0;
    }
}
