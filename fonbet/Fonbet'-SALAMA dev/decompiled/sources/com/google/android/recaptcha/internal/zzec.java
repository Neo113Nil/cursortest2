package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import android.webkit.WebView;
import f6.C1116i;
import g6.AbstractC1159h;
import i6.InterfaceC1287d;
import j6.a;
import java.util.ArrayList;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
final class zzec extends AbstractC1362i implements Function2 {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzed zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(String[] strArr, zzed zzedVar, String str, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zza = strArr;
        this.zzb = zzedVar;
        this.zzc = str;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzec(this.zza, this.zzb, this.zzc, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzec) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        a aVar = a.f14642a;
        AbstractC0603a.p0(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzed zzedVar = this.zzb;
        String str2 = this.zzc;
        webView = zzedVar.zza;
        webView.evaluateJavascript(AbstractC1663a.o(str2, "(", AbstractC1159h.T0(arrayList, ",", null, null, null, 62), ")"), null);
        return C1116i.f13008a;
    }
}
