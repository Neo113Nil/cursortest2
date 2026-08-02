package androidx.datastore.preferences.protobuf;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Bundleable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    public static StringBuilder a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static FqName b(String str, FqName fqName, String str2) {
        FqName child = fqName.child(Name.identifier(str));
        Intrinsics.checkNotNullExpressionValue(child, str2);
        return child;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        Player.Commands fromBundle;
        Timeline.Period fromBundle2;
        switch (this.a) {
            case 1:
                fromBundle = Player.Commands.fromBundle(bundle);
                return fromBundle;
            default:
                fromBundle2 = Timeline.Period.fromBundle(bundle);
                return fromBundle2;
        }
    }
}
