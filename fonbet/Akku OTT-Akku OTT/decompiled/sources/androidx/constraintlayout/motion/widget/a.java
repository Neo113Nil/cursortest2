package androidx.constraintlayout.motion.widget;

import android.content.Context;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer, LibraryVersionComponent.VersionExtractor, ObjectConstructor {
    public static Object a(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    @Override // com.google.android.exoplayer2.util.Consumer
    public void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysLoaded();
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Collection lambda$newCollectionConstructor$13;
        lambda$newCollectionConstructor$13 = ConstructorConstructor.lambda$newCollectionConstructor$13();
        return lambda$newCollectionConstructor$13;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        String lambda$getComponents$2;
        lambda$getComponents$2 = FirebaseCommonRegistrar.lambda$getComponents$2((Context) obj);
        return lambda$getComponents$2;
    }
}
