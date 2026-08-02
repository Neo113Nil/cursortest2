package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.C0688a;
import com.facebook.C0728q;
import com.facebook.F;
import com.facebook.internal.E;
import com.facebook.internal.K;
import com.facebook.z;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;

@SourceDebugExtension({"SMAP\nShareInternalUtility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareInternalUtility.kt\ncom/facebook/share/internal/ShareInternalUtility\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,561:1\n1603#2,9:562\n1855#2:571\n1856#2:573\n1612#2:574\n1549#2:575\n1620#2,3:576\n1603#2,9:579\n1855#2:588\n1856#2:590\n1612#2:591\n1#3:572\n1#3:589\n*S KotlinDebug\n*F\n+ 1 ShareInternalUtility.kt\ncom/facebook/share/internal/ShareInternalUtility\n*L\n229#1:562,9\n229#1:571\n229#1:573\n229#1:574\n230#1:575\n230#1:576,3\n248#1:579,9\n248#1:588\n248#1:590\n248#1:591\n229#1:572\n248#1:589\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    @JvmStatic
    public static final z a(C0688a c0688a, Uri imageUri, K k) throws FileNotFoundException {
        boolean equals;
        boolean equals2;
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        String path = imageUri.getPath();
        E e = E.a;
        equals = StringsKt__StringsJVMKt.equals(Constants.FILE, imageUri.getScheme(), true);
        F f = F.b;
        if (equals && path != null) {
            z.f fVar = new z.f(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(Constants.FILE, fVar);
            return new z(c0688a, "me/staging_resources", bundle, f, k, 32);
        }
        equals2 = StringsKt__StringsJVMKt.equals(FirebaseAnalytics.Param.CONTENT, imageUri.getScheme(), true);
        if (!equals2) {
            throw new C0728q("The image Uri must be either a file:// or content:// Uri");
        }
        z.f fVar2 = new z.f(imageUri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable(Constants.FILE, fVar2);
        return new z(c0688a, "me/staging_resources", bundle2, f, k, 32);
    }
}
