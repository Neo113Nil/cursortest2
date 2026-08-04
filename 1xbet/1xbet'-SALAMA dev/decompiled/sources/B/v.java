package B;

import A1.X;
import C1.C0095a;
import P1.A;
import P1.B;
import P1.C0371b;
import P1.C0374e;
import P1.E;
import W5.AbstractC0486a1;
import Y4.C0581k;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.JsonWriter;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.exoplayer2.Format$Builder;
import io.sentry.protocol.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p058i.C0906c;
import p058i.C0907d;
import p058i.C0908e;
import p058i.C0909f;
import p058i.DialogInterfaceC0910g;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final class v implements J2.f, R1.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f966c;

    public /* synthetic */ v(int i7, Object obj, int i8) {
        this.f964a = i8;
        this.f965b = i7;
        this.f966c = obj;
    }

    @Override // R1.u
    public MediaCodecInfo a(int i7) {
        if (((MediaCodecInfo[]) this.f966c) == null) {
            this.f966c = new MediaCodecList(this.f965b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f966c)[i7];
    }

    @Override // R1.u
    public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // J2.f
    public void c(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name(Message.JsonKeys.PARAMS).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(this.f965b);
        jsonWriter.endObject();
        J2.g.e(jsonWriter, (Map) this.f966c);
        jsonWriter.endObject();
    }

    public void d(long j) {
        int i7 = this.f965b;
        long[] jArr = (long[]) this.f966c;
        if (i7 == jArr.length) {
            this.f966c = Arrays.copyOf(jArr, i7 * 2);
        }
        long[] jArr2 = (long[]) this.f966c;
        int i8 = this.f965b;
        this.f965b = i8 + 1;
        jArr2[i8] = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0910g e() {
        C0907d c0907d = (C0907d) this.f966c;
        DialogInterfaceC0910g dialogInterfaceC0910g = new DialogInterfaceC0910g(c0907d.f13662a, this.f965b);
        View view = c0907d.f13666e;
        C0909f c0909f = dialogInterfaceC0910g.f13710f;
        if (view != null) {
            c0909f.f13704w = view;
        } else {
            CharSequence charSequence = c0907d.f13665d;
            if (charSequence != null) {
                c0909f.f13686d = charSequence;
                TextView textView = c0909f.f13702u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0907d.f13664c;
            if (drawable != null) {
                c0909f.f13700s = drawable;
                ImageView imageView = c0909f.f13701t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0909f.f13701t.setImageDrawable(drawable);
                }
            }
        }
        String str = c0907d.f13667f;
        if (str != null) {
            c0909f.f13687e = str;
            TextView textView2 = c0909f.f13703v;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = c0907d.f13668g;
        if (charSequence2 != null) {
            c0909f.c(-1, charSequence2, c0907d.f13669h);
        }
        CharSequence charSequence3 = c0907d.f13670i;
        if (charSequence3 != null) {
            c0909f.c(-2, charSequence3, c0907d.j);
        }
        if (c0907d.f13673m != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0907d.f13663b.inflate(c0909f.f13677A, (ViewGroup) null);
            int i7 = c0907d.f13675o ? c0909f.f13678B : c0909f.f13679C;
            Object obj = c0907d.f13673m;
            ?? c0908e = obj;
            if (obj == null) {
                c0908e = new C0908e(c0907d.f13662a, i7, R.id.text1, null);
            }
            c0909f.f13705x = c0908e;
            c0909f.f13706y = c0907d.f13676p;
            if (c0907d.f13674n != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0906c(c0907d, c0909f));
            }
            if (c0907d.f13675o) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0909f.f13688f = alertController$RecycleListView;
        }
        dialogInterfaceC0910g.setCancelable(true);
        dialogInterfaceC0910g.setCanceledOnTouchOutside(true);
        dialogInterfaceC0910g.setOnCancelListener(c0907d.f13671k);
        dialogInterfaceC0910g.setOnDismissListener(null);
        p086m.l lVar = c0907d.f13672l;
        if (lVar != null) {
            dialogInterfaceC0910g.setOnKeyListener(lVar);
        }
        return dialogInterfaceC0910g;
    }

    public E f(int i7, C1017n0 c1017n0) {
        if (i7 != 2) {
            String str = (String) c1017n0.f17811b;
            if (i7 == 3 || i7 == 4) {
                return new P1.v(new P1.t(str));
            }
            if (i7 == 21) {
                return new P1.v(new P1.g());
            }
            if (i7 == 27) {
                if (k(4)) {
                    return null;
                }
                return new P1.v(new P1.p(new B(0, j(c1017n0)), k(1), k(8)));
            }
            if (i7 == 36) {
                return new P1.v(new P1.r(new B(0, j(c1017n0))));
            }
            if (i7 == 89) {
                return new P1.v(new P1.g((List) c1017n0.f17812c));
            }
            if (i7 != 138) {
                if (i7 == 172) {
                    return new P1.v(new C0371b(str, 1));
                }
                if (i7 == 257) {
                    return new A(new android.support.v4.media.session.t("application/vnd.dvb.ait"));
                }
                if (i7 == 134) {
                    if (k(16)) {
                        return null;
                    }
                    return new A(new android.support.v4.media.session.t("application/x-scte35"));
                }
                if (i7 != 135) {
                    switch (i7) {
                        case 15:
                            if (k(2)) {
                                return null;
                            }
                            return new P1.v(new C0374e(false, str));
                        case 16:
                            return new P1.v(new P1.m(new B(1, j(c1017n0))));
                        case 17:
                            if (k(2)) {
                                return null;
                            }
                            return new P1.v(new P1.s(str));
                        default:
                            switch (i7) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!k(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new P1.v(new C0371b(str, 0));
            }
            return new P1.v(new P1.f(str));
        }
        return new P1.v(new P1.j(new B(1, j(c1017n0))));
    }

    public long g(int i7) {
        if (i7 >= 0 && i7 < this.f965b) {
            return ((long[]) this.f966c)[i7];
        }
        StringBuilder sbJ = AbstractC0486a1.j(i7, "Invalid index ", ", size is ");
        sbJ.append(this.f965b);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    @Override // R1.u
    public boolean h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // R1.u
    public int i() {
        if (((MediaCodecInfo[]) this.f966c) == null) {
            this.f966c = new MediaCodecList(this.f965b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f966c).length;
    }

    public List j(C1017n0 c1017n0) {
        String str;
        int i7;
        boolean zK = k(32);
        List list = (List) this.f966c;
        if (zK) {
            return list;
        }
        C0095a c0095a = new C0095a((byte[]) c1017n0.f17813d);
        while (c0095a.d() > 0) {
            int iT = c0095a.t();
            int iT2 = c0095a.f1463a + c0095a.t();
            if (iT == 134) {
                ArrayList arrayList = new ArrayList();
                int iT3 = c0095a.t() & 31;
                for (int i8 = 0; i8 < iT3; i8++) {
                    String strR = c0095a.r(3, D3.f.f1719c);
                    int iT4 = c0095a.t();
                    boolean z4 = (iT4 & 128) != 0;
                    if (z4) {
                        i7 = iT4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte bT = (byte) c0095a.t();
                    c0095a.E(1);
                    List listSingletonList = z4 ? Collections.singletonList((bT & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    Format$Builder format$Builder = new Format$Builder();
                    format$Builder.f10537k = str;
                    format$Builder.f10530c = strR;
                    format$Builder.f10526C = i7;
                    format$Builder.f10539m = listSingletonList;
                    arrayList.add(new X(format$Builder));
                }
                list = arrayList;
            }
            c0095a.D(iT2);
        }
        return list;
    }

    public boolean k(int i7) {
        switch (this.f964a) {
            case 5:
                return (i7 & this.f965b) != 0;
            default:
                return ((1 << i7) & this.f965b) != 0;
        }
    }

    public void l(int i7, String str, String str2) {
        if (p136t.e.e(i7) >= p136t.e.e(this.f965b)) {
            HashSet hashSet = (HashSet) this.f966c;
            if (hashSet == null || p136t.e.e(i7) > 0 || hashSet.contains(str)) {
                int iE = p136t.e.e(i7);
                if (iE == 0) {
                    Log.d(str, str2);
                    return;
                }
                if (iE == 1) {
                    Log.i(str, str2);
                } else if (iE == 2) {
                    Log.w(str, str2);
                } else {
                    if (iE != 3) {
                        throw new RuntimeException("Should not reach here!");
                    }
                    Log.e(str, str2);
                }
            }
        }
    }

    public long m(F1.h hVar) {
        C0095a c0095a = (C0095a) this.f966c;
        int i7 = 0;
        hVar.c((byte[]) c0095a.f1465c, 0, 1, false);
        int i8 = ((byte[]) c0095a.f1465c)[0] & 255;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int i9 = 128;
        int i10 = 0;
        while ((i8 & i9) == 0) {
            i9 >>= 1;
            i10++;
        }
        int i11 = i8 & (~i9);
        hVar.c((byte[]) c0095a.f1465c, 1, i10, false);
        while (i7 < i10) {
            i7++;
            i11 = (((byte[]) c0095a.f1465c)[i7] & 255) + (i11 << 8);
        }
        this.f965b = i10 + 1 + this.f965b;
        return i11;
    }

    public void n(int i7, int i8) {
        int[] iArr = (int[]) this.f966c;
        if (i7 >= iArr.length) {
            return;
        }
        this.f965b = (1 << i7) | this.f965b;
        iArr[i7] = i8;
    }

    @Override // R1.u
    public boolean o() {
        return true;
    }

    public int p(int i7) {
        int i8;
        float f7 = -1;
        SparseArray sparseArray = (SparseArray) this.f966c;
        int i9 = 0;
        if (-1 == i7) {
            t tVar = i7 == -1 ? (t) sparseArray.valueAt(0) : (t) sparseArray.get(-1);
            if (tVar == null) {
                return -1;
            }
            while (true) {
                ArrayList arrayList = tVar.f957b;
                if (i9 >= arrayList.size()) {
                    i9 = -1;
                    break;
                }
                if (((u) arrayList.get(i9)).a(f7, f7)) {
                    break;
                }
                i9++;
            }
            if (-1 == i9) {
                return -1;
            }
            i8 = i9 == -1 ? tVar.f958c : ((u) tVar.f957b.get(i9)).f963e;
        } else {
            t tVar2 = (t) sparseArray.get(i7);
            if (tVar2 == null) {
                return -1;
            }
            while (true) {
                ArrayList arrayList2 = tVar2.f957b;
                if (i9 >= arrayList2.size()) {
                    i9 = -1;
                    break;
                }
                if (((u) arrayList2.get(i9)).a(f7, f7)) {
                    break;
                }
                i9++;
            }
            i8 = i9 == -1 ? tVar2.f958c : ((u) tVar2.f957b.get(i9)).f963e;
        }
        return i8;
    }

    public String toString() {
        switch (this.f964a) {
            case 2:
                return "ExistenceFilter{count=" + this.f965b + ", unchangedNames=" + ((C0581k) this.f966c) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v(Object obj, int i7, int i8) {
        this.f964a = i8;
        this.f966c = obj;
        this.f965b = i7;
    }

    public v(int i7) {
        this.f964a = 12;
        this.f966c = null;
        this.f965b = i7;
    }

    public v(int i7, byte b7) {
        this.f964a = i7;
        switch (i7) {
            case 7:
                this.f966c = new int[10];
                break;
            case 13:
                this.f966c = new long[32];
                break;
            default:
                this.f966c = new C0095a(8);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public v(Context context, XmlResourceParser xmlResourceParser) {
        this.f964a = 0;
        this.f965b = -1;
        this.f966c = new SparseArray();
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f953y);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                this.f965b = typedArrayObtainStyledAttributes.getResourceId(index, this.f965b);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            t tVar = null;
            while (true) {
                byte b7 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType != 2) {
                    if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                b7 = 2;
                            } else {
                                b7 = -1;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b7 = 0;
                            } else {
                                b7 = -1;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b7 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b7 = 3;
                            } else {
                                b7 = -1;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 2) {
                        tVar = new t(context, xmlResourceParser);
                        ((SparseArray) this.f966c).put(tVar.f956a, tVar);
                    } else if (b7 == 3) {
                        u uVar = new u(context, xmlResourceParser);
                        if (tVar != null) {
                            tVar.f957b.add(uVar);
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Context context) {
        this(context, DialogInterfaceC0910g.f(0, context));
        this.f964a = 8;
    }

    public v(Context context, int i7) {
        this.f964a = 8;
        this.f966c = new C0907d(new ContextThemeWrapper(context, DialogInterfaceC0910g.f(i7, context)));
        this.f965b = i7;
    }

    public v(boolean z4, boolean z7) {
        this.f964a = 6;
        this.f965b = (z4 || z7) ? 1 : 0;
    }
}
