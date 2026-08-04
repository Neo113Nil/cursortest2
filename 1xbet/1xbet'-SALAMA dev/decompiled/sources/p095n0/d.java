package p095n0;

import B3.g;
import android.support.v4.media.session.t;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC0724t;
import androidx.lifecycle.X;
import java.io.PrintWriter;
import p003a.a;
import p033e3.c;
import p122r.m;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0724t f15299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f15300b;

    public d(InterfaceC0724t interfaceC0724t, X x4) {
        this.f15299a = interfaceC0724t;
        t tVar = new t(x4, c.f15296f);
        String canonicalName = c.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f15300b = (c) tVar.b0(c.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
    }

    public final void b(String str, PrintWriter printWriter) {
        c cVar = this.f15300b;
        if (cVar.f15297d.f16017c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i7 = 0;
        while (true) {
            m mVar = cVar.f15297d;
            if (i7 >= mVar.f16017c) {
                return;
            }
            b bVar = (b) mVar.f16016b[i7];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cVar.f15297d.f16015a[i7]);
            printWriter.print(": ");
            printWriter.println(bVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(bVar.f15293l);
            c cVar2 = bVar.f15293l;
            String str3 = str2 + "  ";
            cVar2.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(cVar2.f12658a);
            if (cVar2.f12659b || cVar2.f12662e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(cVar2.f12659b);
                printWriter.print(" mContentChanged=");
                printWriter.print(cVar2.f12662e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (cVar2.f12660c || cVar2.f12661d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(cVar2.f12660c);
                printWriter.print(" mReset=");
                printWriter.println(cVar2.f12661d);
            }
            if (cVar2.f12664g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(cVar2.f12664g);
                printWriter.print(" waiting=");
                cVar2.f12664g.getClass();
                printWriter.println(false);
            }
            if (cVar2.f12665h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(cVar2.f12665h);
                printWriter.print(" waiting=");
                cVar2.f12665h.getClass();
                printWriter.println(false);
            }
            if (bVar.f15295n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(bVar.f15295n);
                g gVar = bVar.f15295n;
                gVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(gVar.f1063b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            c cVar3 = bVar.f15293l;
            Object obj = bVar.f9565e;
            Object obj2 = obj != B.f9560k ? obj : null;
            cVar3.getClass();
            StringBuilder sb = new StringBuilder(64);
            a.d(sb, obj2);
            sb.append("}");
            printWriter.println(sb.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(bVar.f9563c > 0);
            i7++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a.d(sb, this.f15299a);
        sb.append("}}");
        return sb.toString();
    }
}
