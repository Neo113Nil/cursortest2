package androidx.concurrent.futures;

import android.content.Context;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.util.Collection;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer, LibraryVersionComponent.VersionExtractor, ObjectConstructor {
    public static String a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.util.Consumer
    public void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRemoved();
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Collection lambda$newCollectionConstructor$12;
        lambda$newCollectionConstructor$12 = ConstructorConstructor.lambda$newCollectionConstructor$12();
        return lambda$newCollectionConstructor$12;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        String lambda$getComponents$1;
        lambda$getComponents$1 = FirebaseCommonRegistrar.lambda$getComponents$1((Context) obj);
        return lambda$getComponents$1;
    }
}
