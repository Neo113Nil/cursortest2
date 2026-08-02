package n0;

import B3.g;
import a.AbstractC0603a;
import android.support.v4.media.session.t;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC0745t;
import androidx.lifecycle.X;
import e3.C1018c;
import java.io.PrintWriter;
import r.m;

/* loaded from: classes.dex */
public final class d extends AbstractC1445a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0745t f15293a;

    /* renamed from: b, reason: collision with root package name */
    public final c f15294b;

    public d(InterfaceC0745t interfaceC0745t, X x4) {
        this.f15293a = interfaceC0745t;
        t tVar = new t(x4, c.f15290f);
        String canonicalName = c.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f15294b = (c) tVar.b0(c.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
    }

    public final void b(String str, PrintWriter printWriter) {
        c cVar = this.f15294b;
        if (cVar.f15291d.f16011c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i7 = 0;
        while (true) {
            m mVar = cVar.f15291d;
            if (i7 >= mVar.f16011c) {
                return;
            }
            b bVar = (b) mVar.f16010b[i7];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cVar.f15291d.f16009a[i7]);
            printWriter.print(": ");
            printWriter.println(bVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(bVar.f15287l);
            C1018c c1018c = bVar.f15287l;
            String str3 = str2 + "  ";
            c1018c.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(c1018c.f12652a);
            if (c1018c.f12653b || c1018c.f12656e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(c1018c.f12653b);
                printWriter.print(" mContentChanged=");
                printWriter.print(c1018c.f12656e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (c1018c.f12654c || c1018c.f12655d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(c1018c.f12654c);
                printWriter.print(" mReset=");
                printWriter.println(c1018c.f12655d);
            }
            if (c1018c.f12658g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(c1018c.f12658g);
                printWriter.print(" waiting=");
                c1018c.f12658g.getClass();
                printWriter.println(false);
            }
            if (c1018c.f12659h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(c1018c.f12659h);
                printWriter.print(" waiting=");
                c1018c.f12659h.getClass();
                printWriter.println(false);
            }
            if (bVar.f15289n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(bVar.f15289n);
                g gVar = bVar.f15289n;
                gVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(gVar.f1063b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            C1018c c1018c2 = bVar.f15287l;
            Object obj = bVar.f9565e;
            Object obj2 = obj != B.f9560k ? obj : null;
            c1018c2.getClass();
            StringBuilder sb = new StringBuilder(64);
            AbstractC0603a.d(sb, obj2);
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
        AbstractC0603a.d(sb, this.f15293a);
        sb.append("}}");
        return sb.toString();
    }
}
