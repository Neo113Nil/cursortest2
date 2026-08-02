package Ak;

import GZ.j;
import He.g;
import O7.e;
import WZ.t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.crypto.tink.internal.B;
import i8.d;
import j3.C7253I;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ui.session.configurators.auth.smsretriever.SmsRetrieverConfigurator;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import t40.EnumC9752b;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements e, B.b, OnFailureListener {
    public static int a(Parcel parcel, ArrayList arrayList, int i11, int i12) {
        arrayList.add(EnumC9752b.valueOf(parcel.readString()));
        return i11 + i12;
    }

    public static int b(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i11, int i12) {
        arrayList.add(creator.createFromParcel(parcel));
        return i11 + i12;
    }

    public static String c(int i11, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(i11);
        sb2.append(str);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, str2);
        return sb3;
    }

    public static String d(Context context, String str, j jVar, String str2) {
        Intrinsics.checkNotNullParameter(context, str);
        Intrinsics.checkNotNullParameter(jVar, str2);
        String uri = jVar.b().toString();
        Intrinsics.f(uri);
        return uri;
    }

    public static String f(String str, String str2, String str3, String str4, boolean z11) {
        return str + str2 + str3 + z11 + str4;
    }

    public static String g(StringBuilder sb2, CommonControlSettings commonControlSettings, String str) {
        sb2.append(commonControlSettings);
        sb2.append(str);
        return sb2.toString();
    }

    public static void h(StringBuilder sb2, String str, List list, String str2, t tVar) {
        sb2.append(str);
        sb2.append(list);
        sb2.append(str2);
        sb2.append(tVar);
    }

    @Override // O7.e
    public Object apply(Object obj) {
        return Integer.valueOf(((C7253I) obj).f68964c);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(g gVar) {
        return d.m((g8.e) gVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        SmsRetrieverConfigurator.onCreate$lambda$2$lambda$1(exc);
    }
}
