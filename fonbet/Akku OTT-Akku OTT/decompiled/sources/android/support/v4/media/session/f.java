package android.support.v4.media.session;

import android.content.Context;
import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.util.Collection;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Bundleable.Creator, LibraryVersionComponent.VersionExtractor, ObjectConstructor {
    public static /* synthetic */ boolean a(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String c(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Collection lambda$newCollectionConstructor$11;
        lambda$newCollectionConstructor$11 = ConstructorConstructor.lambda$newCollectionConstructor$11();
        return lambda$newCollectionConstructor$11;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        String lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseCommonRegistrar.lambda$getComponents$0((Context) obj);
        return lambda$getComponents$0;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        DefaultTrackSelector.SelectionOverride lambda$static$0;
        lambda$static$0 = DefaultTrackSelector.SelectionOverride.lambda$static$0(bundle);
        return lambda$static$0;
    }
}
