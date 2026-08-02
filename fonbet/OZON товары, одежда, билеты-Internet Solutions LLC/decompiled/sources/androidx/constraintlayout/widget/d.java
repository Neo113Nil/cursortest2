package androidx.constraintlayout.widget;

import C.o0;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import h2.C6785c;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.maplibre.android.log.Logger;
import org.xmlpull.v1.XmlPullParserException;
import p2.C8834a;
import ru.ozon.app.android.R;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f41697g = {0, 4, 8};

    /* renamed from: h, reason: collision with root package name */
    private static SparseIntArray f41698h;

    /* renamed from: i, reason: collision with root package name */
    private static SparseIntArray f41699i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f41700j = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f41701a;

    /* renamed from: b, reason: collision with root package name */
    public String f41702b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f41703c = 0;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f41704d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f41705e = true;

    /* renamed from: f, reason: collision with root package name */
    private HashMap<Integer, a> f41706f = new HashMap<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f41707a;

        /* renamed from: b, reason: collision with root package name */
        String f41708b;

        /* renamed from: c, reason: collision with root package name */
        public final C0759d f41709c;

        /* renamed from: d, reason: collision with root package name */
        public final c f41710d;

        /* renamed from: e, reason: collision with root package name */
        public final b f41711e;

        /* renamed from: f, reason: collision with root package name */
        public final e f41712f;

        /* renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f41713g;

        /* renamed from: h, reason: collision with root package name */
        C0758a f41714h;

        /* renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        static class C0758a {

            /* renamed from: a, reason: collision with root package name */
            int[] f41715a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            int[] f41716b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            int f41717c = 0;

            /* renamed from: d, reason: collision with root package name */
            int[] f41718d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            float[] f41719e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            int f41720f = 0;

            /* renamed from: g, reason: collision with root package name */
            int[] f41721g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            String[] f41722h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            int f41723i = 0;

            /* renamed from: j, reason: collision with root package name */
            int[] f41724j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            boolean[] f41725k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            int f41726l = 0;

            C0758a() {
            }

            final void a(float f7, int i11) {
                int i12 = this.f41720f;
                int[] iArr = this.f41718d;
                if (i12 >= iArr.length) {
                    this.f41718d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f41719e;
                    this.f41719e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f41718d;
                int i13 = this.f41720f;
                iArr2[i13] = i11;
                float[] fArr2 = this.f41719e;
                this.f41720f = i13 + 1;
                fArr2[i13] = f7;
            }

            final void b(int i11, int i12) {
                int i13 = this.f41717c;
                int[] iArr = this.f41715a;
                if (i13 >= iArr.length) {
                    this.f41715a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f41716b;
                    this.f41716b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f41715a;
                int i14 = this.f41717c;
                iArr3[i14] = i11;
                int[] iArr4 = this.f41716b;
                this.f41717c = i14 + 1;
                iArr4[i14] = i12;
            }

            final void c(int i11, String str) {
                int i12 = this.f41723i;
                int[] iArr = this.f41721g;
                if (i12 >= iArr.length) {
                    this.f41721g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f41722h;
                    this.f41722h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f41721g;
                int i13 = this.f41723i;
                iArr2[i13] = i11;
                String[] strArr2 = this.f41722h;
                this.f41723i = i13 + 1;
                strArr2[i13] = str;
            }

            final void d(int i11, boolean z11) {
                int i12 = this.f41726l;
                int[] iArr = this.f41724j;
                if (i12 >= iArr.length) {
                    this.f41724j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f41725k;
                    this.f41725k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f41724j;
                int i13 = this.f41726l;
                iArr2[i13] = i11;
                boolean[] zArr2 = this.f41725k;
                this.f41726l = i13 + 1;
                zArr2[i13] = z11;
            }

            final void e(a aVar) {
                for (int i11 = 0; i11 < this.f41717c; i11++) {
                    int i12 = this.f41715a[i11];
                    int i13 = this.f41716b[i11];
                    int i14 = d.f41700j;
                    if (i12 == 6) {
                        aVar.f41711e.f41731D = i13;
                    } else if (i12 == 7) {
                        aVar.f41711e.f41732E = i13;
                    } else if (i12 == 8) {
                        aVar.f41711e.f41738K = i13;
                    } else if (i12 == 27) {
                        aVar.f41711e.f41733F = i13;
                    } else if (i12 == 28) {
                        aVar.f41711e.f41735H = i13;
                    } else if (i12 == 41) {
                        aVar.f41711e.f41750W = i13;
                    } else if (i12 == 42) {
                        aVar.f41711e.f41751X = i13;
                    } else if (i12 == 61) {
                        aVar.f41711e.f41728A = i13;
                    } else if (i12 == 62) {
                        aVar.f41711e.f41729B = i13;
                    } else if (i12 == 72) {
                        aVar.f41711e.f41767g0 = i13;
                    } else if (i12 == 73) {
                        aVar.f41711e.f41769h0 = i13;
                    } else if (i12 == 2) {
                        aVar.f41711e.f41737J = i13;
                    } else if (i12 == 31) {
                        aVar.f41711e.f41739L = i13;
                    } else if (i12 == 34) {
                        aVar.f41711e.f41736I = i13;
                    } else if (i12 == 38) {
                        aVar.f41707a = i13;
                    } else if (i12 == 64) {
                        aVar.f41710d.f41798b = i13;
                    } else if (i12 == 66) {
                        aVar.f41710d.f41802f = i13;
                    } else if (i12 == 76) {
                        aVar.f41710d.f41801e = i13;
                    } else if (i12 == 78) {
                        aVar.f41709c.f41812c = i13;
                    } else if (i12 == 97) {
                        aVar.f41711e.f41785p0 = i13;
                    } else if (i12 == 93) {
                        aVar.f41711e.f41740M = i13;
                    } else if (i12 != 94) {
                        switch (i12) {
                            case 11:
                                aVar.f41711e.f41744Q = i13;
                                break;
                            case 12:
                                aVar.f41711e.f41745R = i13;
                                break;
                            case 13:
                                aVar.f41711e.f41741N = i13;
                                break;
                            case 14:
                                aVar.f41711e.f41743P = i13;
                                break;
                            case 15:
                                aVar.f41711e.f41746S = i13;
                                break;
                            case 16:
                                aVar.f41711e.f41742O = i13;
                                break;
                            case 17:
                                aVar.f41711e.f41762e = i13;
                                break;
                            case 18:
                                aVar.f41711e.f41764f = i13;
                                break;
                            default:
                                switch (i12) {
                                    case 21:
                                        aVar.f41711e.f41760d = i13;
                                        break;
                                    case 22:
                                        aVar.f41709c.f41811b = i13;
                                        break;
                                    case 23:
                                        aVar.f41711e.f41758c = i13;
                                        break;
                                    case 24:
                                        aVar.f41711e.f41734G = i13;
                                        break;
                                    default:
                                        switch (i12) {
                                            case 54:
                                                aVar.f41711e.f41752Y = i13;
                                                break;
                                            case 55:
                                                aVar.f41711e.f41753Z = i13;
                                                break;
                                            case 56:
                                                aVar.f41711e.f41755a0 = i13;
                                                break;
                                            case 57:
                                                aVar.f41711e.f41757b0 = i13;
                                                break;
                                            case 58:
                                                aVar.f41711e.f41759c0 = i13;
                                                break;
                                            case 59:
                                                aVar.f41711e.f41761d0 = i13;
                                                break;
                                            default:
                                                switch (i12) {
                                                    case 82:
                                                        aVar.f41710d.f41799c = i13;
                                                        break;
                                                    case 83:
                                                        aVar.f41712f.f41824i = i13;
                                                        break;
                                                    case 84:
                                                        aVar.f41710d.f41806j = i13;
                                                        break;
                                                    default:
                                                        switch (i12) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                aVar.f41710d.f41808l = i13;
                                                                break;
                                                            case 89:
                                                                aVar.f41710d.f41809m = i13;
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                    } else {
                        aVar.f41711e.f41747T = i13;
                    }
                }
                for (int i15 = 0; i15 < this.f41720f; i15++) {
                    int i16 = this.f41718d[i15];
                    float f7 = this.f41719e[i15];
                    int i17 = d.f41700j;
                    if (i16 == 19) {
                        aVar.f41711e.f41766g = f7;
                    } else if (i16 == 20) {
                        aVar.f41711e.f41793x = f7;
                    } else if (i16 == 37) {
                        aVar.f41711e.f41794y = f7;
                    } else if (i16 == 60) {
                        aVar.f41712f.f41817b = f7;
                    } else if (i16 == 63) {
                        aVar.f41711e.f41730C = f7;
                    } else if (i16 == 79) {
                        aVar.f41710d.f41803g = f7;
                    } else if (i16 == 85) {
                        aVar.f41710d.f41805i = f7;
                    } else if (i16 != 87) {
                        if (i16 == 39) {
                            aVar.f41711e.f41749V = f7;
                        } else if (i16 != 40) {
                            switch (i16) {
                                case 43:
                                    aVar.f41709c.f41813d = f7;
                                    break;
                                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    e eVar = aVar.f41712f;
                                    eVar.f41829n = f7;
                                    eVar.f41828m = true;
                                    break;
                                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    aVar.f41712f.f41818c = f7;
                                    break;
                                case 46:
                                    aVar.f41712f.f41819d = f7;
                                    break;
                                case 47:
                                    aVar.f41712f.f41820e = f7;
                                    break;
                                case 48:
                                    aVar.f41712f.f41821f = f7;
                                    break;
                                case 49:
                                    aVar.f41712f.f41822g = f7;
                                    break;
                                case 50:
                                    aVar.f41712f.f41823h = f7;
                                    break;
                                case 51:
                                    aVar.f41712f.f41825j = f7;
                                    break;
                                case 52:
                                    aVar.f41712f.f41826k = f7;
                                    break;
                                case 53:
                                    aVar.f41712f.f41827l = f7;
                                    break;
                                default:
                                    switch (i16) {
                                        case 67:
                                            aVar.f41710d.f41804h = f7;
                                            break;
                                        case 68:
                                            aVar.f41709c.f41814e = f7;
                                            break;
                                        case 69:
                                            aVar.f41711e.f41763e0 = f7;
                                            break;
                                        case 70:
                                            aVar.f41711e.f41765f0 = f7;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                            }
                        } else {
                            aVar.f41711e.f41748U = f7;
                        }
                    }
                }
                for (int i18 = 0; i18 < this.f41723i; i18++) {
                    int i19 = this.f41721g[i18];
                    String str = this.f41722h[i18];
                    int i21 = d.f41700j;
                    if (i19 == 5) {
                        aVar.f41711e.f41795z = str;
                    } else if (i19 == 65) {
                        aVar.f41710d.f41800d = str;
                    } else if (i19 == 74) {
                        b bVar = aVar.f41711e;
                        bVar.f41775k0 = str;
                        bVar.f41773j0 = null;
                    } else if (i19 == 77) {
                        aVar.f41711e.f41777l0 = str;
                    } else if (i19 != 87) {
                        if (i19 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            aVar.f41710d.f41807k = str;
                        }
                    }
                }
                for (int i22 = 0; i22 < this.f41726l; i22++) {
                    int i23 = this.f41724j[i22];
                    boolean z11 = this.f41725k[i22];
                    int i24 = d.f41700j;
                    if (i23 == 44) {
                        aVar.f41712f.f41828m = z11;
                    } else if (i23 == 75) {
                        aVar.f41711e.f41783o0 = z11;
                    } else if (i23 != 87) {
                        if (i23 == 80) {
                            aVar.f41711e.f41779m0 = z11;
                        } else if (i23 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            aVar.f41711e.f41781n0 = z11;
                        }
                    }
                }
            }
        }

        public a() {
            C0759d c0759d = new C0759d();
            c0759d.f41810a = false;
            c0759d.f41811b = 0;
            c0759d.f41812c = 0;
            c0759d.f41813d = 1.0f;
            c0759d.f41814e = Float.NaN;
            this.f41709c = c0759d;
            c cVar = new c();
            cVar.f41797a = false;
            cVar.f41798b = -1;
            cVar.f41799c = 0;
            cVar.f41800d = null;
            cVar.f41801e = -1;
            cVar.f41802f = 0;
            cVar.f41803g = Float.NaN;
            cVar.f41804h = Float.NaN;
            cVar.f41805i = Float.NaN;
            cVar.f41806j = -1;
            cVar.f41807k = null;
            cVar.f41808l = -3;
            cVar.f41809m = -1;
            this.f41710d = cVar;
            this.f41711e = new b();
            e eVar = new e();
            eVar.f41816a = false;
            eVar.f41817b = 0.0f;
            eVar.f41818c = 0.0f;
            eVar.f41819d = 0.0f;
            eVar.f41820e = 1.0f;
            eVar.f41821f = 1.0f;
            eVar.f41822g = Float.NaN;
            eVar.f41823h = Float.NaN;
            eVar.f41824i = -1;
            eVar.f41825j = 0.0f;
            eVar.f41826k = 0.0f;
            eVar.f41827l = 0.0f;
            eVar.f41828m = false;
            eVar.f41829n = 0.0f;
            this.f41712f = eVar;
            this.f41713g = new HashMap<>();
        }

        static void b(a aVar, androidx.constraintlayout.widget.b bVar, int i11, e.a aVar2) {
            aVar.h(i11, aVar2);
            if (bVar instanceof Barrier) {
                b bVar2 = aVar.f41711e;
                bVar2.f41771i0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f41767g0 = barrier.c();
                bVar2.f41773j0 = barrier.getReferencedIds();
                bVar2.f41769h0 = barrier.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i11, ConstraintLayout.b bVar) {
            this.f41707a = i11;
            int i12 = bVar.f41628e;
            b bVar2 = this.f41711e;
            bVar2.f41770i = i12;
            bVar2.f41772j = bVar.f41630f;
            bVar2.f41774k = bVar.f41632g;
            bVar2.f41776l = bVar.f41634h;
            bVar2.f41778m = bVar.f41636i;
            bVar2.f41780n = bVar.f41638j;
            bVar2.f41782o = bVar.f41640k;
            bVar2.f41784p = bVar.f41642l;
            bVar2.f41786q = bVar.f41644m;
            bVar2.f41787r = bVar.f41646n;
            bVar2.f41788s = bVar.f41648o;
            bVar2.f41789t = bVar.f41655s;
            bVar2.f41790u = bVar.f41656t;
            bVar2.f41791v = bVar.f41657u;
            bVar2.f41792w = bVar.f41658v;
            bVar2.f41793x = bVar.f41598E;
            bVar2.f41794y = bVar.f41599F;
            bVar2.f41795z = bVar.f41600G;
            bVar2.f41728A = bVar.f41650p;
            bVar2.f41729B = bVar.f41652q;
            bVar2.f41730C = bVar.f41654r;
            bVar2.f41731D = bVar.f41613T;
            bVar2.f41732E = bVar.f41614U;
            bVar2.f41733F = bVar.f41615V;
            bVar2.f41766g = bVar.f41624c;
            bVar2.f41762e = bVar.f41620a;
            bVar2.f41764f = bVar.f41622b;
            bVar2.f41758c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f41760d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f41734G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f41735H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f41736I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f41737J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f41740M = bVar.f41597D;
            bVar2.f41748U = bVar.f41602I;
            bVar2.f41749V = bVar.f41601H;
            bVar2.f41751X = bVar.f41604K;
            bVar2.f41750W = bVar.f41603J;
            bVar2.f41779m0 = bVar.f41616W;
            bVar2.f41781n0 = bVar.f41617X;
            bVar2.f41752Y = bVar.f41605L;
            bVar2.f41753Z = bVar.f41606M;
            bVar2.f41755a0 = bVar.f41609P;
            bVar2.f41757b0 = bVar.f41610Q;
            bVar2.f41759c0 = bVar.f41607N;
            bVar2.f41761d0 = bVar.f41608O;
            bVar2.f41763e0 = bVar.f41611R;
            bVar2.f41765f0 = bVar.f41612S;
            bVar2.f41777l0 = bVar.f41618Y;
            bVar2.f41742O = bVar.f41660x;
            bVar2.f41744Q = bVar.f41662z;
            bVar2.f41741N = bVar.f41659w;
            bVar2.f41743P = bVar.f41661y;
            bVar2.f41746S = bVar.f41594A;
            bVar2.f41745R = bVar.f41595B;
            bVar2.f41747T = bVar.f41596C;
            bVar2.f41785p0 = bVar.f41619Z;
            bVar2.f41738K = bVar.getMarginEnd();
            bVar2.f41739L = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(int i11, e.a aVar) {
            g(i11, aVar);
            this.f41709c.f41813d = aVar.f41834r0;
            float f7 = aVar.f41837u0;
            e eVar = this.f41712f;
            eVar.f41817b = f7;
            eVar.f41818c = aVar.f41838v0;
            eVar.f41819d = aVar.f41839w0;
            eVar.f41820e = aVar.f41840x0;
            eVar.f41821f = aVar.f41841y0;
            eVar.f41822g = aVar.f41842z0;
            eVar.f41823h = aVar.f41830A0;
            eVar.f41825j = aVar.f41831B0;
            eVar.f41826k = aVar.f41832C0;
            eVar.f41827l = aVar.f41833D0;
            eVar.f41829n = aVar.f41836t0;
            eVar.f41828m = aVar.f41835s0;
        }

        public final void d(a aVar) {
            C0758a c0758a = this.f41714h;
            if (c0758a != null) {
                c0758a.e(aVar);
            }
        }

        public final void e(ConstraintLayout.b bVar) {
            b bVar2 = this.f41711e;
            bVar.f41628e = bVar2.f41770i;
            bVar.f41630f = bVar2.f41772j;
            bVar.f41632g = bVar2.f41774k;
            bVar.f41634h = bVar2.f41776l;
            bVar.f41636i = bVar2.f41778m;
            bVar.f41638j = bVar2.f41780n;
            bVar.f41640k = bVar2.f41782o;
            bVar.f41642l = bVar2.f41784p;
            bVar.f41644m = bVar2.f41786q;
            bVar.f41646n = bVar2.f41787r;
            bVar.f41648o = bVar2.f41788s;
            bVar.f41655s = bVar2.f41789t;
            bVar.f41656t = bVar2.f41790u;
            bVar.f41657u = bVar2.f41791v;
            bVar.f41658v = bVar2.f41792w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f41734G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f41735H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f41736I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f41737J;
            bVar.f41594A = bVar2.f41746S;
            bVar.f41595B = bVar2.f41745R;
            bVar.f41660x = bVar2.f41742O;
            bVar.f41662z = bVar2.f41744Q;
            bVar.f41598E = bVar2.f41793x;
            bVar.f41599F = bVar2.f41794y;
            bVar.f41650p = bVar2.f41728A;
            bVar.f41652q = bVar2.f41729B;
            bVar.f41654r = bVar2.f41730C;
            bVar.f41600G = bVar2.f41795z;
            bVar.f41613T = bVar2.f41731D;
            bVar.f41614U = bVar2.f41732E;
            bVar.f41602I = bVar2.f41748U;
            bVar.f41601H = bVar2.f41749V;
            bVar.f41604K = bVar2.f41751X;
            bVar.f41603J = bVar2.f41750W;
            bVar.f41616W = bVar2.f41779m0;
            bVar.f41617X = bVar2.f41781n0;
            bVar.f41605L = bVar2.f41752Y;
            bVar.f41606M = bVar2.f41753Z;
            bVar.f41609P = bVar2.f41755a0;
            bVar.f41610Q = bVar2.f41757b0;
            bVar.f41607N = bVar2.f41759c0;
            bVar.f41608O = bVar2.f41761d0;
            bVar.f41611R = bVar2.f41763e0;
            bVar.f41612S = bVar2.f41765f0;
            bVar.f41615V = bVar2.f41733F;
            bVar.f41624c = bVar2.f41766g;
            bVar.f41620a = bVar2.f41762e;
            bVar.f41622b = bVar2.f41764f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f41758c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f41760d;
            String str = bVar2.f41777l0;
            if (str != null) {
                bVar.f41618Y = str;
            }
            bVar.f41619Z = bVar2.f41785p0;
            bVar.setMarginStart(bVar2.f41739L);
            bVar.setMarginEnd(bVar2.f41738K);
            bVar.b();
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            a aVar = new a();
            aVar.f41711e.a(this.f41711e);
            aVar.f41710d.a(this.f41710d);
            C0759d c0759d = aVar.f41709c;
            C0759d c0759d2 = this.f41709c;
            c0759d.f41810a = c0759d2.f41810a;
            c0759d.f41811b = c0759d2.f41811b;
            c0759d.f41813d = c0759d2.f41813d;
            c0759d.f41814e = c0759d2.f41814e;
            c0759d.f41812c = c0759d2.f41812c;
            aVar.f41712f.a(this.f41712f);
            aVar.f41707a = this.f41707a;
            aVar.f41714h = this.f41714h;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: q0, reason: collision with root package name */
        private static SparseIntArray f41727q0;

        /* renamed from: c, reason: collision with root package name */
        public int f41758c;

        /* renamed from: d, reason: collision with root package name */
        public int f41760d;

        /* renamed from: j0, reason: collision with root package name */
        public int[] f41773j0;

        /* renamed from: k0, reason: collision with root package name */
        public String f41775k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f41777l0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f41754a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f41756b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f41762e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f41764f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f41766g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public boolean f41768h = true;

        /* renamed from: i, reason: collision with root package name */
        public int f41770i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f41772j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f41774k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f41776l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f41778m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f41780n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f41782o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f41784p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f41786q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f41787r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f41788s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f41789t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f41790u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f41791v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f41792w = -1;

        /* renamed from: x, reason: collision with root package name */
        public float f41793x = 0.5f;

        /* renamed from: y, reason: collision with root package name */
        public float f41794y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public String f41795z = null;

        /* renamed from: A, reason: collision with root package name */
        public int f41728A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f41729B = 0;

        /* renamed from: C, reason: collision with root package name */
        public float f41730C = 0.0f;

        /* renamed from: D, reason: collision with root package name */
        public int f41731D = -1;

        /* renamed from: E, reason: collision with root package name */
        public int f41732E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f41733F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f41734G = 0;

        /* renamed from: H, reason: collision with root package name */
        public int f41735H = 0;

        /* renamed from: I, reason: collision with root package name */
        public int f41736I = 0;

        /* renamed from: J, reason: collision with root package name */
        public int f41737J = 0;

        /* renamed from: K, reason: collision with root package name */
        public int f41738K = 0;

        /* renamed from: L, reason: collision with root package name */
        public int f41739L = 0;

        /* renamed from: M, reason: collision with root package name */
        public int f41740M = 0;

        /* renamed from: N, reason: collision with root package name */
        public int f41741N = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: O, reason: collision with root package name */
        public int f41742O = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: P, reason: collision with root package name */
        public int f41743P = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: Q, reason: collision with root package name */
        public int f41744Q = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: R, reason: collision with root package name */
        public int f41745R = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: S, reason: collision with root package name */
        public int f41746S = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: T, reason: collision with root package name */
        public int f41747T = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: U, reason: collision with root package name */
        public float f41748U = -1.0f;

        /* renamed from: V, reason: collision with root package name */
        public float f41749V = -1.0f;

        /* renamed from: W, reason: collision with root package name */
        public int f41750W = 0;

        /* renamed from: X, reason: collision with root package name */
        public int f41751X = 0;

        /* renamed from: Y, reason: collision with root package name */
        public int f41752Y = 0;

        /* renamed from: Z, reason: collision with root package name */
        public int f41753Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f41755a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f41757b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f41759c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f41761d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public float f41763e0 = 1.0f;

        /* renamed from: f0, reason: collision with root package name */
        public float f41765f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public int f41767g0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public int f41769h0 = 0;

        /* renamed from: i0, reason: collision with root package name */
        public int f41771i0 = -1;

        /* renamed from: m0, reason: collision with root package name */
        public boolean f41779m0 = false;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f41781n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f41783o0 = true;

        /* renamed from: p0, reason: collision with root package name */
        public int f41785p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41727q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(b bVar) {
            this.f41754a = bVar.f41754a;
            this.f41758c = bVar.f41758c;
            this.f41756b = bVar.f41756b;
            this.f41760d = bVar.f41760d;
            this.f41762e = bVar.f41762e;
            this.f41764f = bVar.f41764f;
            this.f41766g = bVar.f41766g;
            this.f41768h = bVar.f41768h;
            this.f41770i = bVar.f41770i;
            this.f41772j = bVar.f41772j;
            this.f41774k = bVar.f41774k;
            this.f41776l = bVar.f41776l;
            this.f41778m = bVar.f41778m;
            this.f41780n = bVar.f41780n;
            this.f41782o = bVar.f41782o;
            this.f41784p = bVar.f41784p;
            this.f41786q = bVar.f41786q;
            this.f41787r = bVar.f41787r;
            this.f41788s = bVar.f41788s;
            this.f41789t = bVar.f41789t;
            this.f41790u = bVar.f41790u;
            this.f41791v = bVar.f41791v;
            this.f41792w = bVar.f41792w;
            this.f41793x = bVar.f41793x;
            this.f41794y = bVar.f41794y;
            this.f41795z = bVar.f41795z;
            this.f41728A = bVar.f41728A;
            this.f41729B = bVar.f41729B;
            this.f41730C = bVar.f41730C;
            this.f41731D = bVar.f41731D;
            this.f41732E = bVar.f41732E;
            this.f41733F = bVar.f41733F;
            this.f41734G = bVar.f41734G;
            this.f41735H = bVar.f41735H;
            this.f41736I = bVar.f41736I;
            this.f41737J = bVar.f41737J;
            this.f41738K = bVar.f41738K;
            this.f41739L = bVar.f41739L;
            this.f41740M = bVar.f41740M;
            this.f41741N = bVar.f41741N;
            this.f41742O = bVar.f41742O;
            this.f41743P = bVar.f41743P;
            this.f41744Q = bVar.f41744Q;
            this.f41745R = bVar.f41745R;
            this.f41746S = bVar.f41746S;
            this.f41747T = bVar.f41747T;
            this.f41748U = bVar.f41748U;
            this.f41749V = bVar.f41749V;
            this.f41750W = bVar.f41750W;
            this.f41751X = bVar.f41751X;
            this.f41752Y = bVar.f41752Y;
            this.f41753Z = bVar.f41753Z;
            this.f41755a0 = bVar.f41755a0;
            this.f41757b0 = bVar.f41757b0;
            this.f41759c0 = bVar.f41759c0;
            this.f41761d0 = bVar.f41761d0;
            this.f41763e0 = bVar.f41763e0;
            this.f41765f0 = bVar.f41765f0;
            this.f41767g0 = bVar.f41767g0;
            this.f41769h0 = bVar.f41769h0;
            this.f41771i0 = bVar.f41771i0;
            this.f41777l0 = bVar.f41777l0;
            int[] iArr = bVar.f41773j0;
            if (iArr == null || bVar.f41775k0 != null) {
                this.f41773j0 = null;
            } else {
                this.f41773j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f41775k0 = bVar.f41775k0;
            this.f41779m0 = bVar.f41779m0;
            this.f41781n0 = bVar.f41781n0;
            this.f41783o0 = bVar.f41783o0;
            this.f41785p0 = bVar.f41785p0;
        }

        final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f41854k);
            this.f41756b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                SparseIntArray sparseIntArray = f41727q0;
                int i12 = sparseIntArray.get(index);
                switch (i12) {
                    case 1:
                        this.f41786q = d.R(obtainStyledAttributes, index, this.f41786q);
                        break;
                    case 2:
                        this.f41737J = obtainStyledAttributes.getDimensionPixelSize(index, this.f41737J);
                        break;
                    case 3:
                        this.f41784p = d.R(obtainStyledAttributes, index, this.f41784p);
                        break;
                    case 4:
                        this.f41782o = d.R(obtainStyledAttributes, index, this.f41782o);
                        break;
                    case 5:
                        this.f41795z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f41731D = obtainStyledAttributes.getDimensionPixelOffset(index, this.f41731D);
                        break;
                    case 7:
                        this.f41732E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f41732E);
                        break;
                    case 8:
                        this.f41738K = obtainStyledAttributes.getDimensionPixelSize(index, this.f41738K);
                        break;
                    case 9:
                        this.f41792w = d.R(obtainStyledAttributes, index, this.f41792w);
                        break;
                    case 10:
                        this.f41791v = d.R(obtainStyledAttributes, index, this.f41791v);
                        break;
                    case 11:
                        this.f41744Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f41744Q);
                        break;
                    case 12:
                        this.f41745R = obtainStyledAttributes.getDimensionPixelSize(index, this.f41745R);
                        break;
                    case 13:
                        this.f41741N = obtainStyledAttributes.getDimensionPixelSize(index, this.f41741N);
                        break;
                    case 14:
                        this.f41743P = obtainStyledAttributes.getDimensionPixelSize(index, this.f41743P);
                        break;
                    case 15:
                        this.f41746S = obtainStyledAttributes.getDimensionPixelSize(index, this.f41746S);
                        break;
                    case 16:
                        this.f41742O = obtainStyledAttributes.getDimensionPixelSize(index, this.f41742O);
                        break;
                    case 17:
                        this.f41762e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f41762e);
                        break;
                    case 18:
                        this.f41764f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f41764f);
                        break;
                    case 19:
                        this.f41766g = obtainStyledAttributes.getFloat(index, this.f41766g);
                        break;
                    case 20:
                        this.f41793x = obtainStyledAttributes.getFloat(index, this.f41793x);
                        break;
                    case 21:
                        this.f41760d = obtainStyledAttributes.getLayoutDimension(index, this.f41760d);
                        break;
                    case 22:
                        this.f41758c = obtainStyledAttributes.getLayoutDimension(index, this.f41758c);
                        break;
                    case 23:
                        this.f41734G = obtainStyledAttributes.getDimensionPixelSize(index, this.f41734G);
                        break;
                    case 24:
                        this.f41770i = d.R(obtainStyledAttributes, index, this.f41770i);
                        break;
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                        this.f41772j = d.R(obtainStyledAttributes, index, this.f41772j);
                        break;
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        this.f41733F = obtainStyledAttributes.getInt(index, this.f41733F);
                        break;
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        this.f41735H = obtainStyledAttributes.getDimensionPixelSize(index, this.f41735H);
                        break;
                    case 28:
                        this.f41774k = d.R(obtainStyledAttributes, index, this.f41774k);
                        break;
                    case 29:
                        this.f41776l = d.R(obtainStyledAttributes, index, this.f41776l);
                        break;
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        this.f41739L = obtainStyledAttributes.getDimensionPixelSize(index, this.f41739L);
                        break;
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        this.f41789t = d.R(obtainStyledAttributes, index, this.f41789t);
                        break;
                    case 32:
                        this.f41790u = d.R(obtainStyledAttributes, index, this.f41790u);
                        break;
                    case 33:
                        this.f41736I = obtainStyledAttributes.getDimensionPixelSize(index, this.f41736I);
                        break;
                    case 34:
                        this.f41780n = d.R(obtainStyledAttributes, index, this.f41780n);
                        break;
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        this.f41778m = d.R(obtainStyledAttributes, index, this.f41778m);
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        this.f41794y = obtainStyledAttributes.getFloat(index, this.f41794y);
                        break;
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        this.f41749V = obtainStyledAttributes.getFloat(index, this.f41749V);
                        break;
                    case 38:
                        this.f41748U = obtainStyledAttributes.getFloat(index, this.f41748U);
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        this.f41750W = obtainStyledAttributes.getInt(index, this.f41750W);
                        break;
                    case 40:
                        this.f41751X = obtainStyledAttributes.getInt(index, this.f41751X);
                        break;
                    case 41:
                        d.S(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.S(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i12) {
                            case 61:
                                this.f41728A = d.R(obtainStyledAttributes, index, this.f41728A);
                                break;
                            case 62:
                                this.f41729B = obtainStyledAttributes.getDimensionPixelSize(index, this.f41729B);
                                break;
                            case 63:
                                this.f41730C = obtainStyledAttributes.getFloat(index, this.f41730C);
                                break;
                            default:
                                switch (i12) {
                                    case 69:
                                        this.f41763e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f41765f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f41767g0 = obtainStyledAttributes.getInt(index, this.f41767g0);
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /* 73 */:
                                        this.f41769h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f41769h0);
                                        break;
                                    case 74:
                                        this.f41775k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f41783o0 = obtainStyledAttributes.getBoolean(index, this.f41783o0);
                                        break;
                                    case 76:
                                        this.f41785p0 = obtainStyledAttributes.getInt(index, this.f41785p0);
                                        break;
                                    case 77:
                                        this.f41787r = d.R(obtainStyledAttributes, index, this.f41787r);
                                        break;
                                    case 78:
                                        this.f41788s = d.R(obtainStyledAttributes, index, this.f41788s);
                                        break;
                                    case 79:
                                        this.f41747T = obtainStyledAttributes.getDimensionPixelSize(index, this.f41747T);
                                        break;
                                    case 80:
                                        this.f41740M = obtainStyledAttributes.getDimensionPixelSize(index, this.f41740M);
                                        break;
                                    case 81:
                                        this.f41752Y = obtainStyledAttributes.getInt(index, this.f41752Y);
                                        break;
                                    case 82:
                                        this.f41753Z = obtainStyledAttributes.getInt(index, this.f41753Z);
                                        break;
                                    case 83:
                                        this.f41757b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f41757b0);
                                        break;
                                    case 84:
                                        this.f41755a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f41755a0);
                                        break;
                                    case 85:
                                        this.f41761d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f41761d0);
                                        break;
                                    case 86:
                                        this.f41759c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f41759c0);
                                        break;
                                    case 87:
                                        this.f41779m0 = obtainStyledAttributes.getBoolean(index, this.f41779m0);
                                        break;
                                    case 88:
                                        this.f41781n0 = obtainStyledAttributes.getBoolean(index, this.f41781n0);
                                        break;
                                    case 89:
                                        this.f41777l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f41768h = obtainStyledAttributes.getBoolean(index, this.f41768h);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: n, reason: collision with root package name */
        private static SparseIntArray f41796n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f41797a;

        /* renamed from: b, reason: collision with root package name */
        public int f41798b;

        /* renamed from: c, reason: collision with root package name */
        public int f41799c;

        /* renamed from: d, reason: collision with root package name */
        public String f41800d;

        /* renamed from: e, reason: collision with root package name */
        public int f41801e;

        /* renamed from: f, reason: collision with root package name */
        public int f41802f;

        /* renamed from: g, reason: collision with root package name */
        public float f41803g;

        /* renamed from: h, reason: collision with root package name */
        public float f41804h;

        /* renamed from: i, reason: collision with root package name */
        public float f41805i;

        /* renamed from: j, reason: collision with root package name */
        public int f41806j;

        /* renamed from: k, reason: collision with root package name */
        public String f41807k;

        /* renamed from: l, reason: collision with root package name */
        public int f41808l;

        /* renamed from: m, reason: collision with root package name */
        public int f41809m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41796n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(c cVar) {
            this.f41797a = cVar.f41797a;
            this.f41798b = cVar.f41798b;
            this.f41800d = cVar.f41800d;
            this.f41801e = cVar.f41801e;
            this.f41802f = cVar.f41802f;
            this.f41804h = cVar.f41804h;
            this.f41803g = cVar.f41803g;
        }

        final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f41855l);
            this.f41797a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                switch (f41796n.get(index)) {
                    case 1:
                        this.f41804h = obtainStyledAttributes.getFloat(index, this.f41804h);
                        break;
                    case 2:
                        this.f41801e = obtainStyledAttributes.getInt(index, this.f41801e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f41800d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f41800d = C6785c.f64643c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f41802f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f41798b = d.R(obtainStyledAttributes, index, this.f41798b);
                        break;
                    case 6:
                        this.f41799c = obtainStyledAttributes.getInteger(index, this.f41799c);
                        break;
                    case 7:
                        this.f41803g = obtainStyledAttributes.getFloat(index, this.f41803g);
                        break;
                    case 8:
                        this.f41806j = obtainStyledAttributes.getInteger(index, this.f41806j);
                        break;
                    case 9:
                        this.f41805i = obtainStyledAttributes.getFloat(index, this.f41805i);
                        break;
                    case 10:
                        int i12 = obtainStyledAttributes.peekValue(index).type;
                        if (i12 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f41809m = resourceId;
                            if (resourceId != -1) {
                                this.f41808l = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i12 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f41807k = string;
                            if (string.indexOf("/") > 0) {
                                this.f41809m = obtainStyledAttributes.getResourceId(index, -1);
                                this.f41808l = -2;
                                break;
                            } else {
                                this.f41808l = -1;
                                break;
                            }
                        } else {
                            this.f41808l = obtainStyledAttributes.getInteger(index, this.f41809m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0759d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f41810a;

        /* renamed from: b, reason: collision with root package name */
        public int f41811b;

        /* renamed from: c, reason: collision with root package name */
        public int f41812c;

        /* renamed from: d, reason: collision with root package name */
        public float f41813d;

        /* renamed from: e, reason: collision with root package name */
        public float f41814e;

        final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f41861r);
            this.f41810a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 1) {
                    this.f41813d = obtainStyledAttributes.getFloat(index, this.f41813d);
                } else if (index == 0) {
                    this.f41811b = obtainStyledAttributes.getInt(index, this.f41811b);
                    this.f41811b = d.f41697g[this.f41811b];
                } else if (index == 4) {
                    this.f41812c = obtainStyledAttributes.getInt(index, this.f41812c);
                } else if (index == 3) {
                    this.f41814e = obtainStyledAttributes.getFloat(index, this.f41814e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f41815o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f41816a;

        /* renamed from: b, reason: collision with root package name */
        public float f41817b;

        /* renamed from: c, reason: collision with root package name */
        public float f41818c;

        /* renamed from: d, reason: collision with root package name */
        public float f41819d;

        /* renamed from: e, reason: collision with root package name */
        public float f41820e;

        /* renamed from: f, reason: collision with root package name */
        public float f41821f;

        /* renamed from: g, reason: collision with root package name */
        public float f41822g;

        /* renamed from: h, reason: collision with root package name */
        public float f41823h;

        /* renamed from: i, reason: collision with root package name */
        public int f41824i;

        /* renamed from: j, reason: collision with root package name */
        public float f41825j;

        /* renamed from: k, reason: collision with root package name */
        public float f41826k;

        /* renamed from: l, reason: collision with root package name */
        public float f41827l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f41828m;

        /* renamed from: n, reason: collision with root package name */
        public float f41829n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41815o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(e eVar) {
            this.f41816a = eVar.f41816a;
            this.f41817b = eVar.f41817b;
            this.f41818c = eVar.f41818c;
            this.f41819d = eVar.f41819d;
            this.f41820e = eVar.f41820e;
            this.f41821f = eVar.f41821f;
            this.f41822g = eVar.f41822g;
            this.f41823h = eVar.f41823h;
            this.f41824i = eVar.f41824i;
            this.f41825j = eVar.f41825j;
            this.f41826k = eVar.f41826k;
            this.f41827l = eVar.f41827l;
            this.f41828m = eVar.f41828m;
            this.f41829n = eVar.f41829n;
        }

        final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f41864u);
            this.f41816a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                switch (f41815o.get(index)) {
                    case 1:
                        this.f41817b = obtainStyledAttributes.getFloat(index, this.f41817b);
                        break;
                    case 2:
                        this.f41818c = obtainStyledAttributes.getFloat(index, this.f41818c);
                        break;
                    case 3:
                        this.f41819d = obtainStyledAttributes.getFloat(index, this.f41819d);
                        break;
                    case 4:
                        this.f41820e = obtainStyledAttributes.getFloat(index, this.f41820e);
                        break;
                    case 5:
                        this.f41821f = obtainStyledAttributes.getFloat(index, this.f41821f);
                        break;
                    case 6:
                        this.f41822g = obtainStyledAttributes.getDimension(index, this.f41822g);
                        break;
                    case 7:
                        this.f41823h = obtainStyledAttributes.getDimension(index, this.f41823h);
                        break;
                    case 8:
                        this.f41825j = obtainStyledAttributes.getDimension(index, this.f41825j);
                        break;
                    case 9:
                        this.f41826k = obtainStyledAttributes.getDimension(index, this.f41826k);
                        break;
                    case 10:
                        this.f41827l = obtainStyledAttributes.getDimension(index, this.f41827l);
                        break;
                    case 11:
                        this.f41828m = true;
                        this.f41829n = obtainStyledAttributes.getDimension(index, this.f41829n);
                        break;
                    case 12:
                        this.f41824i = d.R(obtainStyledAttributes, index, this.f41824i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f41698h = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f41699i = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    private static int[] D(Barrier barrier, String str) {
        int i11;
        Object designInformation;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i12 = 0;
        int i13 = 0;
        while (i12 < split.length) {
            String trim = split[i12].trim();
            try {
                i11 = h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i11 = 0;
            }
            if (i11 == 0) {
                i11 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i11 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i11 = ((Integer) designInformation).intValue();
            }
            iArr[i13] = i11;
            i12++;
            i13++;
        }
        return i13 != split.length ? Arrays.copyOf(iArr, i13) : iArr;
    }

    private static a G(Context context, AttributeSet attributeSet, boolean z11) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z11 ? i.f41846c : i.f41844a);
        if (z11) {
            U(aVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i11 = 0;
            while (true) {
                b bVar = aVar.f41711e;
                if (i11 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i11);
                    C0759d c0759d = aVar.f41709c;
                    e eVar = aVar.f41712f;
                    c cVar = aVar.f41710d;
                    if (index != 1 && 23 != index && 24 != index) {
                        cVar.f41797a = true;
                        bVar.f41756b = true;
                        c0759d.f41810a = true;
                        eVar.f41816a = true;
                    }
                    SparseIntArray sparseIntArray = f41698h;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            bVar.f41786q = R(obtainStyledAttributes, index, bVar.f41786q);
                            break;
                        case 2:
                            bVar.f41737J = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41737J);
                            break;
                        case 3:
                            bVar.f41784p = R(obtainStyledAttributes, index, bVar.f41784p);
                            break;
                        case 4:
                            bVar.f41782o = R(obtainStyledAttributes, index, bVar.f41782o);
                            break;
                        case 5:
                            bVar.f41795z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            bVar.f41731D = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f41731D);
                            break;
                        case 7:
                            bVar.f41732E = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f41732E);
                            break;
                        case 8:
                            bVar.f41738K = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41738K);
                            break;
                        case 9:
                            bVar.f41792w = R(obtainStyledAttributes, index, bVar.f41792w);
                            break;
                        case 10:
                            bVar.f41791v = R(obtainStyledAttributes, index, bVar.f41791v);
                            break;
                        case 11:
                            bVar.f41744Q = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41744Q);
                            break;
                        case 12:
                            bVar.f41745R = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41745R);
                            break;
                        case 13:
                            bVar.f41741N = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41741N);
                            break;
                        case 14:
                            bVar.f41743P = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41743P);
                            break;
                        case 15:
                            bVar.f41746S = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41746S);
                            break;
                        case 16:
                            bVar.f41742O = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41742O);
                            break;
                        case 17:
                            bVar.f41762e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f41762e);
                            break;
                        case 18:
                            bVar.f41764f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f41764f);
                            break;
                        case 19:
                            bVar.f41766g = obtainStyledAttributes.getFloat(index, bVar.f41766g);
                            break;
                        case 20:
                            bVar.f41793x = obtainStyledAttributes.getFloat(index, bVar.f41793x);
                            break;
                        case 21:
                            bVar.f41760d = obtainStyledAttributes.getLayoutDimension(index, bVar.f41760d);
                            break;
                        case 22:
                            int i12 = obtainStyledAttributes.getInt(index, c0759d.f41811b);
                            c0759d.f41811b = i12;
                            c0759d.f41811b = f41697g[i12];
                            break;
                        case 23:
                            bVar.f41758c = obtainStyledAttributes.getLayoutDimension(index, bVar.f41758c);
                            break;
                        case 24:
                            bVar.f41734G = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41734G);
                            break;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            bVar.f41770i = R(obtainStyledAttributes, index, bVar.f41770i);
                            break;
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            bVar.f41772j = R(obtainStyledAttributes, index, bVar.f41772j);
                            break;
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            bVar.f41733F = obtainStyledAttributes.getInt(index, bVar.f41733F);
                            break;
                        case 28:
                            bVar.f41735H = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41735H);
                            break;
                        case 29:
                            bVar.f41774k = R(obtainStyledAttributes, index, bVar.f41774k);
                            break;
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            bVar.f41776l = R(obtainStyledAttributes, index, bVar.f41776l);
                            break;
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            bVar.f41739L = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41739L);
                            break;
                        case 32:
                            bVar.f41789t = R(obtainStyledAttributes, index, bVar.f41789t);
                            break;
                        case 33:
                            bVar.f41790u = R(obtainStyledAttributes, index, bVar.f41790u);
                            break;
                        case 34:
                            bVar.f41736I = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41736I);
                            break;
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            bVar.f41780n = R(obtainStyledAttributes, index, bVar.f41780n);
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            bVar.f41778m = R(obtainStyledAttributes, index, bVar.f41778m);
                            break;
                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            bVar.f41794y = obtainStyledAttributes.getFloat(index, bVar.f41794y);
                            break;
                        case 38:
                            aVar.f41707a = obtainStyledAttributes.getResourceId(index, aVar.f41707a);
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            bVar.f41749V = obtainStyledAttributes.getFloat(index, bVar.f41749V);
                            break;
                        case 40:
                            bVar.f41748U = obtainStyledAttributes.getFloat(index, bVar.f41748U);
                            break;
                        case 41:
                            bVar.f41750W = obtainStyledAttributes.getInt(index, bVar.f41750W);
                            break;
                        case 42:
                            bVar.f41751X = obtainStyledAttributes.getInt(index, bVar.f41751X);
                            break;
                        case 43:
                            c0759d.f41813d = obtainStyledAttributes.getFloat(index, c0759d.f41813d);
                            break;
                        case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            eVar.f41828m = true;
                            eVar.f41829n = obtainStyledAttributes.getDimension(index, eVar.f41829n);
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            eVar.f41818c = obtainStyledAttributes.getFloat(index, eVar.f41818c);
                            break;
                        case 46:
                            eVar.f41819d = obtainStyledAttributes.getFloat(index, eVar.f41819d);
                            break;
                        case 47:
                            eVar.f41820e = obtainStyledAttributes.getFloat(index, eVar.f41820e);
                            break;
                        case 48:
                            eVar.f41821f = obtainStyledAttributes.getFloat(index, eVar.f41821f);
                            break;
                        case 49:
                            eVar.f41822g = obtainStyledAttributes.getDimension(index, eVar.f41822g);
                            break;
                        case 50:
                            eVar.f41823h = obtainStyledAttributes.getDimension(index, eVar.f41823h);
                            break;
                        case 51:
                            eVar.f41825j = obtainStyledAttributes.getDimension(index, eVar.f41825j);
                            break;
                        case 52:
                            eVar.f41826k = obtainStyledAttributes.getDimension(index, eVar.f41826k);
                            break;
                        case 53:
                            eVar.f41827l = obtainStyledAttributes.getDimension(index, eVar.f41827l);
                            break;
                        case 54:
                            bVar.f41752Y = obtainStyledAttributes.getInt(index, bVar.f41752Y);
                            break;
                        case 55:
                            bVar.f41753Z = obtainStyledAttributes.getInt(index, bVar.f41753Z);
                            break;
                        case 56:
                            bVar.f41755a0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41755a0);
                            break;
                        case 57:
                            bVar.f41757b0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41757b0);
                            break;
                        case 58:
                            bVar.f41759c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41759c0);
                            break;
                        case 59:
                            bVar.f41761d0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41761d0);
                            break;
                        case 60:
                            eVar.f41817b = obtainStyledAttributes.getFloat(index, eVar.f41817b);
                            break;
                        case 61:
                            bVar.f41728A = R(obtainStyledAttributes, index, bVar.f41728A);
                            break;
                        case 62:
                            bVar.f41729B = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41729B);
                            break;
                        case 63:
                            bVar.f41730C = obtainStyledAttributes.getFloat(index, bVar.f41730C);
                            break;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            cVar.f41798b = R(obtainStyledAttributes, index, cVar.f41798b);
                            break;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (obtainStyledAttributes.peekValue(index).type != 3) {
                                cVar.f41800d = C6785c.f64643c[obtainStyledAttributes.getInteger(index, 0)];
                                break;
                            } else {
                                cVar.f41800d = obtainStyledAttributes.getString(index);
                                break;
                            }
                        case 66:
                            cVar.f41802f = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            cVar.f41804h = obtainStyledAttributes.getFloat(index, cVar.f41804h);
                            break;
                        case 68:
                            c0759d.f41814e = obtainStyledAttributes.getFloat(index, c0759d.f41814e);
                            break;
                        case 69:
                            bVar.f41763e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            bVar.f41765f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            bVar.f41767g0 = obtainStyledAttributes.getInt(index, bVar.f41767g0);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 73 */:
                            bVar.f41769h0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41769h0);
                            break;
                        case 74:
                            bVar.f41775k0 = obtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            bVar.f41783o0 = obtainStyledAttributes.getBoolean(index, bVar.f41783o0);
                            break;
                        case 76:
                            cVar.f41801e = obtainStyledAttributes.getInt(index, cVar.f41801e);
                            break;
                        case 77:
                            bVar.f41777l0 = obtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            c0759d.f41812c = obtainStyledAttributes.getInt(index, c0759d.f41812c);
                            break;
                        case 79:
                            cVar.f41803g = obtainStyledAttributes.getFloat(index, cVar.f41803g);
                            break;
                        case 80:
                            bVar.f41779m0 = obtainStyledAttributes.getBoolean(index, bVar.f41779m0);
                            break;
                        case 81:
                            bVar.f41781n0 = obtainStyledAttributes.getBoolean(index, bVar.f41781n0);
                            break;
                        case 82:
                            cVar.f41799c = obtainStyledAttributes.getInteger(index, cVar.f41799c);
                            break;
                        case 83:
                            eVar.f41824i = R(obtainStyledAttributes, index, eVar.f41824i);
                            break;
                        case 84:
                            cVar.f41806j = obtainStyledAttributes.getInteger(index, cVar.f41806j);
                            break;
                        case 85:
                            cVar.f41805i = obtainStyledAttributes.getFloat(index, cVar.f41805i);
                            break;
                        case 86:
                            int i13 = obtainStyledAttributes.peekValue(index).type;
                            if (i13 != 1) {
                                if (i13 != 3) {
                                    cVar.f41808l = obtainStyledAttributes.getInteger(index, cVar.f41809m);
                                    break;
                                } else {
                                    String string = obtainStyledAttributes.getString(index);
                                    cVar.f41807k = string;
                                    if (string.indexOf("/") <= 0) {
                                        cVar.f41808l = -1;
                                        break;
                                    } else {
                                        cVar.f41809m = obtainStyledAttributes.getResourceId(index, -1);
                                        cVar.f41808l = -2;
                                        break;
                                    }
                                }
                            } else {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                cVar.f41809m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    cVar.f41808l = -2;
                                    break;
                                }
                            }
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            bVar.f41787r = R(obtainStyledAttributes, index, bVar.f41787r);
                            break;
                        case 92:
                            bVar.f41788s = R(obtainStyledAttributes, index, bVar.f41788s);
                            break;
                        case 93:
                            bVar.f41740M = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41740M);
                            break;
                        case 94:
                            bVar.f41747T = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f41747T);
                            break;
                        case 95:
                            S(bVar, obtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            S(bVar, obtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            bVar.f41785p0 = obtainStyledAttributes.getInt(index, bVar.f41785p0);
                            break;
                    }
                    i11++;
                } else if (bVar.f41775k0 != null) {
                    bVar.f41773j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a H(int i11) {
        HashMap<Integer, a> hashMap = this.f41706f;
        if (!hashMap.containsKey(Integer.valueOf(i11))) {
            hashMap.put(Integer.valueOf(i11), new a());
        }
        return hashMap.get(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int R(TypedArray typedArray, int i11, int i12) {
        int resourceId = typedArray.getResourceId(i11, i12);
        return resourceId == -1 ? typedArray.getInt(i11, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void S(Object obj, TypedArray typedArray, int i11, int i12) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i13 = typedArray.peekValue(i11).type;
        boolean z11 = true;
        int i14 = 0;
        if (i13 == 3) {
            String string = typedArray.getString(i11);
            if (string == null) {
                return;
            }
            int indexOf = string.indexOf(61);
            int length = string.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                        if (i12 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                        }
                        T(bVar, trim2);
                        return;
                    }
                    if (obj instanceof b) {
                        ((b) obj).f41795z = trim2;
                        return;
                    } else {
                        if (obj instanceof a.C0758a) {
                            ((a.C0758a) obj).c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                            if (i12 == 0) {
                                ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                                bVar2.f41601H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                                bVar2.f41602I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof b) {
                            b bVar3 = (b) obj;
                            if (i12 == 0) {
                                bVar3.f41758c = 0;
                                bVar3.f41749V = parseFloat;
                                return;
                            } else {
                                bVar3.f41760d = 0;
                                bVar3.f41748U = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof a.C0758a) {
                            a.C0758a c0758a = (a.C0758a) obj;
                            if (i12 == 0) {
                                c0758a.b(23, 0);
                                c0758a.a(parseFloat, 39);
                                return;
                            } else {
                                c0758a.b(21, 0);
                                c0758a.a(parseFloat, 40);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                            if (i12 == 0) {
                                ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                                bVar4.f41611R = max;
                                bVar4.f41605L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                                bVar4.f41612S = max;
                                bVar4.f41606M = 2;
                                return;
                            }
                        }
                        if (obj instanceof b) {
                            b bVar5 = (b) obj;
                            if (i12 == 0) {
                                bVar5.f41758c = 0;
                                bVar5.f41763e0 = max;
                                bVar5.f41752Y = 2;
                                return;
                            } else {
                                bVar5.f41760d = 0;
                                bVar5.f41765f0 = max;
                                bVar5.f41753Z = 2;
                                return;
                            }
                        }
                        if (obj instanceof a.C0758a) {
                            a.C0758a c0758a2 = (a.C0758a) obj;
                            if (i12 == 0) {
                                c0758a2.b(23, 0);
                                c0758a2.b(54, 2);
                                return;
                            } else {
                                c0758a2.b(21, 0);
                                c0758a2.b(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i13 != 5) {
            dimensionPixelSize = typedArray.getInt(i11, 0);
            if (dimensionPixelSize == -4) {
                i14 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z11 = false;
            }
            if (!(obj instanceof ConstraintLayout.b)) {
                ConstraintLayout.b bVar6 = (ConstraintLayout.b) obj;
                if (i12 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar6).width = i14;
                    bVar6.f41616W = z11;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar6).height = i14;
                    bVar6.f41617X = z11;
                    return;
                }
            }
            if (obj instanceof b) {
                b bVar7 = (b) obj;
                if (i12 == 0) {
                    bVar7.f41758c = i14;
                    bVar7.f41779m0 = z11;
                    return;
                } else {
                    bVar7.f41760d = i14;
                    bVar7.f41781n0 = z11;
                    return;
                }
            }
            if (obj instanceof a.C0758a) {
                a.C0758a c0758a3 = (a.C0758a) obj;
                if (i12 == 0) {
                    c0758a3.b(23, i14);
                    c0758a3.d(80, z11);
                    return;
                } else {
                    c0758a3.b(21, i14);
                    c0758a3.d(81, z11);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i11, 0);
        z11 = false;
        i14 = dimensionPixelSize;
        if (!(obj instanceof ConstraintLayout.b)) {
        }
    }

    static void T(ConstraintLayout.b bVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i11 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f41600G = str;
    }

    private static void U(a aVar, TypedArray typedArray) {
        boolean z11;
        int indexCount = typedArray.getIndexCount();
        a.C0758a c0758a = new a.C0758a();
        aVar.f41714h = c0758a;
        c cVar = aVar.f41710d;
        cVar.f41797a = false;
        b bVar = aVar.f41711e;
        bVar.f41756b = false;
        C0759d c0759d = aVar.f41709c;
        c0759d.f41810a = false;
        e eVar = aVar.f41712f;
        eVar.f41816a = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            int i12 = f41699i.get(index);
            SparseIntArray sparseIntArray = f41698h;
            switch (i12) {
                case 2:
                    z11 = false;
                    c0758a.b(2, typedArray.getDimensionPixelSize(index, bVar.f41737J));
                    continue;
                case 3:
                case 4:
                case 9:
                case 10:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case 32:
                case 33:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 5:
                    z11 = false;
                    c0758a.c(5, typedArray.getString(index));
                    continue;
                case 6:
                    z11 = false;
                    c0758a.b(6, typedArray.getDimensionPixelOffset(index, bVar.f41731D));
                    continue;
                case 7:
                    z11 = false;
                    c0758a.b(7, typedArray.getDimensionPixelOffset(index, bVar.f41732E));
                    continue;
                case 8:
                    z11 = false;
                    c0758a.b(8, typedArray.getDimensionPixelSize(index, bVar.f41738K));
                    continue;
                case 11:
                    z11 = false;
                    c0758a.b(11, typedArray.getDimensionPixelSize(index, bVar.f41744Q));
                    continue;
                case 12:
                    z11 = false;
                    c0758a.b(12, typedArray.getDimensionPixelSize(index, bVar.f41745R));
                    continue;
                case 13:
                    z11 = false;
                    c0758a.b(13, typedArray.getDimensionPixelSize(index, bVar.f41741N));
                    continue;
                case 14:
                    z11 = false;
                    c0758a.b(14, typedArray.getDimensionPixelSize(index, bVar.f41743P));
                    continue;
                case 15:
                    z11 = false;
                    c0758a.b(15, typedArray.getDimensionPixelSize(index, bVar.f41746S));
                    continue;
                case 16:
                    z11 = false;
                    c0758a.b(16, typedArray.getDimensionPixelSize(index, bVar.f41742O));
                    continue;
                case 17:
                    z11 = false;
                    c0758a.b(17, typedArray.getDimensionPixelOffset(index, bVar.f41762e));
                    continue;
                case 18:
                    z11 = false;
                    c0758a.b(18, typedArray.getDimensionPixelOffset(index, bVar.f41764f));
                    continue;
                case 19:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, bVar.f41766g), 19);
                    continue;
                case 20:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, bVar.f41793x), 20);
                    continue;
                case 21:
                    z11 = false;
                    c0758a.b(21, typedArray.getLayoutDimension(index, bVar.f41760d));
                    continue;
                case 22:
                    z11 = false;
                    c0758a.b(22, f41697g[typedArray.getInt(index, c0759d.f41811b)]);
                    continue;
                case 23:
                    z11 = false;
                    c0758a.b(23, typedArray.getLayoutDimension(index, bVar.f41758c));
                    continue;
                case 24:
                    z11 = false;
                    c0758a.b(24, typedArray.getDimensionPixelSize(index, bVar.f41734G));
                    continue;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    z11 = false;
                    c0758a.b(27, typedArray.getInt(index, bVar.f41733F));
                    continue;
                case 28:
                    z11 = false;
                    c0758a.b(28, typedArray.getDimensionPixelSize(index, bVar.f41735H));
                    continue;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z11 = false;
                    c0758a.b(31, typedArray.getDimensionPixelSize(index, bVar.f41739L));
                    continue;
                case 34:
                    z11 = false;
                    c0758a.b(34, typedArray.getDimensionPixelSize(index, bVar.f41736I));
                    continue;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, bVar.f41794y), 37);
                    continue;
                case 38:
                    z11 = false;
                    int resourceId = typedArray.getResourceId(index, aVar.f41707a);
                    aVar.f41707a = resourceId;
                    c0758a.b(38, resourceId);
                    continue;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, bVar.f41749V), 39);
                    continue;
                case 40:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, bVar.f41748U), 40);
                    continue;
                case 41:
                    z11 = false;
                    c0758a.b(41, typedArray.getInt(index, bVar.f41750W));
                    continue;
                case 42:
                    z11 = false;
                    c0758a.b(42, typedArray.getInt(index, bVar.f41751X));
                    continue;
                case 43:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, c0759d.f41813d), 43);
                    continue;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    z11 = false;
                    c0758a.d(44, true);
                    c0758a.a(typedArray.getDimension(index, eVar.f41829n), 44);
                    continue;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, eVar.f41818c), 45);
                    continue;
                case 46:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, eVar.f41819d), 46);
                    continue;
                case 47:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, eVar.f41820e), 47);
                    continue;
                case 48:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, eVar.f41821f), 48);
                    continue;
                case 49:
                    z11 = false;
                    c0758a.a(typedArray.getDimension(index, eVar.f41822g), 49);
                    continue;
                case 50:
                    z11 = false;
                    c0758a.a(typedArray.getDimension(index, eVar.f41823h), 50);
                    continue;
                case 51:
                    z11 = false;
                    c0758a.a(typedArray.getDimension(index, eVar.f41825j), 51);
                    continue;
                case 52:
                    z11 = false;
                    c0758a.a(typedArray.getDimension(index, eVar.f41826k), 52);
                    continue;
                case 53:
                    z11 = false;
                    c0758a.a(typedArray.getDimension(index, eVar.f41827l), 53);
                    continue;
                case 54:
                    z11 = false;
                    c0758a.b(54, typedArray.getInt(index, bVar.f41752Y));
                    continue;
                case 55:
                    z11 = false;
                    c0758a.b(55, typedArray.getInt(index, bVar.f41753Z));
                    continue;
                case 56:
                    z11 = false;
                    c0758a.b(56, typedArray.getDimensionPixelSize(index, bVar.f41755a0));
                    continue;
                case 57:
                    z11 = false;
                    c0758a.b(57, typedArray.getDimensionPixelSize(index, bVar.f41757b0));
                    continue;
                case 58:
                    z11 = false;
                    c0758a.b(58, typedArray.getDimensionPixelSize(index, bVar.f41759c0));
                    continue;
                case 59:
                    z11 = false;
                    c0758a.b(59, typedArray.getDimensionPixelSize(index, bVar.f41761d0));
                    continue;
                case 60:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, eVar.f41817b), 60);
                    continue;
                case 62:
                    z11 = false;
                    c0758a.b(62, typedArray.getDimensionPixelSize(index, bVar.f41729B));
                    continue;
                case 63:
                    z11 = false;
                    c0758a.a(typedArray.getFloat(index, bVar.f41730C), 63);
                    continue;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    z11 = false;
                    c0758a.b(64, R(typedArray, index, cVar.f41798b));
                    continue;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    z11 = false;
                    if (typedArray.peekValue(index).type != 3) {
                        c0758a.c(65, C6785c.f64643c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        c0758a.c(65, typedArray.getString(index));
                        continue;
                    }
                case 66:
                    z11 = false;
                    c0758a.b(66, typedArray.getInt(index, 0));
                    continue;
                case 67:
                    c0758a.a(typedArray.getFloat(index, cVar.f41804h), 67);
                    break;
                case 68:
                    c0758a.a(typedArray.getFloat(index, c0759d.f41814e), 68);
                    break;
                case 69:
                    c0758a.a(typedArray.getFloat(index, 1.0f), 69);
                    break;
                case 70:
                    c0758a.a(typedArray.getFloat(index, 1.0f), 70);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0758a.b(72, typedArray.getInt(index, bVar.f41767g0));
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 73 */:
                    c0758a.b(73, typedArray.getDimensionPixelSize(index, bVar.f41769h0));
                    break;
                case 74:
                    c0758a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0758a.d(75, typedArray.getBoolean(index, bVar.f41783o0));
                    break;
                case 76:
                    c0758a.b(76, typedArray.getInt(index, cVar.f41801e));
                    break;
                case 77:
                    c0758a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0758a.b(78, typedArray.getInt(index, c0759d.f41812c));
                    break;
                case 79:
                    c0758a.a(typedArray.getFloat(index, cVar.f41803g), 79);
                    break;
                case 80:
                    c0758a.d(80, typedArray.getBoolean(index, bVar.f41779m0));
                    break;
                case 81:
                    c0758a.d(81, typedArray.getBoolean(index, bVar.f41781n0));
                    break;
                case 82:
                    c0758a.b(82, typedArray.getInteger(index, cVar.f41799c));
                    break;
                case 83:
                    c0758a.b(83, R(typedArray, index, eVar.f41824i));
                    break;
                case 84:
                    c0758a.b(84, typedArray.getInteger(index, cVar.f41806j));
                    break;
                case 85:
                    c0758a.a(typedArray.getFloat(index, cVar.f41805i), 85);
                    break;
                case 86:
                    int i13 = typedArray.peekValue(index).type;
                    if (i13 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        cVar.f41809m = resourceId2;
                        c0758a.b(89, resourceId2);
                        if (cVar.f41809m != -1) {
                            cVar.f41808l = -2;
                            c0758a.b(88, -2);
                            break;
                        }
                    } else if (i13 == 3) {
                        String string = typedArray.getString(index);
                        cVar.f41807k = string;
                        c0758a.c(90, string);
                        if (cVar.f41807k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            cVar.f41809m = resourceId3;
                            c0758a.b(89, resourceId3);
                            cVar.f41808l = -2;
                            c0758a.b(88, -2);
                            break;
                        } else {
                            cVar.f41808l = -1;
                            c0758a.b(88, -1);
                            break;
                        }
                    } else {
                        int integer = typedArray.getInteger(index, cVar.f41809m);
                        cVar.f41808l = integer;
                        c0758a.b(88, integer);
                        break;
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 93:
                    c0758a.b(93, typedArray.getDimensionPixelSize(index, bVar.f41740M));
                    break;
                case 94:
                    c0758a.b(94, typedArray.getDimensionPixelSize(index, bVar.f41747T));
                    break;
                case 95:
                    S(c0758a, typedArray, index, 0);
                    z11 = false;
                    continue;
                case 96:
                    S(c0758a, typedArray, index, 1);
                    break;
                case 97:
                    c0758a.b(97, typedArray.getInt(index, bVar.f41785p0));
                    break;
                case 98:
                    if (MotionLayout.f41220I0) {
                        int resourceId4 = typedArray.getResourceId(index, aVar.f41707a);
                        aVar.f41707a = resourceId4;
                        if (resourceId4 == -1) {
                            aVar.f41708b = typedArray.getString(index);
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f41708b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f41707a = typedArray.getResourceId(index, aVar.f41707a);
                        break;
                    }
                    break;
                case Logger.NONE /* 99 */:
                    c0758a.d(99, typedArray.getBoolean(index, bVar.f41768h));
                    break;
            }
            z11 = false;
        }
    }

    public static a j(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, i.f41846c);
        U(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private static String j0(int i11) {
        switch (i11) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void A(int i11, int i12) {
        H(i11).f41711e.f41758c = i12;
    }

    public final void B(int i11) {
        H(i11).f41711e.f41781n0 = true;
    }

    public final void C(int i11, boolean z11) {
        H(i11).f41711e.f41779m0 = z11;
    }

    public final void E(int[] iArr, float[] fArr, int i11) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            H(iArr[0]).f41711e.f41749V = fArr[0];
        }
        H(iArr[0]).f41711e.f41750W = i11;
        int i12 = 1;
        t(iArr[0], 1, 0, 1, -1);
        for (int i13 = 1; i13 < iArr.length; i13++) {
            int i14 = i13 - 1;
            t(iArr[i13], i12, iArr[i14], 2, -1);
            int i15 = i12;
            t(iArr[i14], 2, iArr[i13], i15, -1);
            i12 = i15;
            if (fArr != null) {
                H(iArr[i13]).f41711e.f41749V = fArr[i13];
            }
        }
        t(iArr[iArr.length - 1], 2, 0, 2, -1);
    }

    public final void F(int i11, int i12, int[] iArr, float[] fArr) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            H(iArr[0]).f41711e.f41748U = fArr[0];
        }
        H(iArr[0]).f41711e.f41751X = 2;
        t(iArr[0], 3, i11, 3, 0);
        for (int i13 = 1; i13 < iArr.length; i13++) {
            int i14 = i13 - 1;
            t(iArr[i13], 3, iArr[i14], 4, 0);
            t(iArr[i14], 4, iArr[i13], 3, 0);
            if (fArr != null) {
                H(iArr[i13]).f41711e.f41748U = fArr[i13];
            }
        }
        t(iArr[iArr.length - 1], 4, i12, 4, 0);
    }

    public final a I(int i11) {
        HashMap<Integer, a> hashMap = this.f41706f;
        if (hashMap.containsKey(Integer.valueOf(i11))) {
            return hashMap.get(Integer.valueOf(i11));
        }
        return null;
    }

    public final int J(int i11) {
        return H(i11).f41711e.f41760d;
    }

    public final int[] K() {
        Integer[] numArr = (Integer[]) this.f41706f.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = numArr[i11].intValue();
        }
        return iArr;
    }

    public final a L(int i11) {
        return H(i11);
    }

    public final int M(int i11) {
        return H(i11).f41709c.f41811b;
    }

    public final int N(int i11) {
        return H(i11).f41709c.f41812c;
    }

    public final int O(int i11) {
        return H(i11).f41711e.f41758c;
    }

    public final void P(int i11, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a G11 = G(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        G11.f41711e.f41754a = true;
                    }
                    this.f41706f.put(Integer.valueOf(G11.f41707a), G11);
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ce, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlResourceParser.getName()) {
                            case "Constraint":
                                aVar = G(context, Xml.asAttributeSet(xmlResourceParser), false);
                                break;
                            case "ConstraintOverride":
                                aVar = G(context, Xml.asAttributeSet(xmlResourceParser), true);
                                break;
                            case "Guideline":
                                aVar = G(context, Xml.asAttributeSet(xmlResourceParser), false);
                                b bVar = aVar.f41711e;
                                bVar.f41754a = true;
                                bVar.f41756b = true;
                                break;
                            case "Barrier":
                                aVar = G(context, Xml.asAttributeSet(xmlResourceParser), false);
                                aVar.f41711e.f41771i0 = 1;
                                break;
                            case "PropertySet":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.f41709c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "Transform":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.f41712f.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "Layout":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.f41711e.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "Motion":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.f41710d.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "CustomAttribute":
                            case "CustomMethod":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                androidx.constraintlayout.widget.a.h(context, xmlResourceParser, aVar.f41713g);
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    break;
                                }
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    break;
                                }
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    break;
                                }
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    break;
                                }
                                break;
                        }
                        if (r4 == 0) {
                            return;
                        }
                        if (r4 == 1 || r4 == 2 || r4 == 3) {
                            this.f41706f.put(Integer.valueOf(aVar.f41707a), aVar);
                            aVar = null;
                        }
                    }
                } else {
                    xmlResourceParser.getName();
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    public final void V(MotionLayout motionLayout) {
        int childCount = motionLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = motionLayout.getChildAt(i11);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f41705e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            HashMap<Integer, a> hashMap = this.f41706f;
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new a());
            }
            a aVar = hashMap.get(Integer.valueOf(id2));
            if (aVar != null) {
                b bVar2 = aVar.f41711e;
                if (!bVar2.f41756b) {
                    aVar.g(id2, bVar);
                    if (childAt instanceof androidx.constraintlayout.widget.b) {
                        bVar2.f41773j0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            bVar2.f41783o0 = barrier.a();
                            bVar2.f41767g0 = barrier.c();
                            bVar2.f41769h0 = barrier.b();
                        }
                    }
                    bVar2.f41756b = true;
                }
                C0759d c0759d = aVar.f41709c;
                if (!c0759d.f41810a) {
                    c0759d.f41811b = childAt.getVisibility();
                    c0759d.f41813d = childAt.getAlpha();
                    c0759d.f41810a = true;
                }
                e eVar = aVar.f41712f;
                if (!eVar.f41816a) {
                    eVar.f41816a = true;
                    eVar.f41817b = childAt.getRotation();
                    eVar.f41818c = childAt.getRotationX();
                    eVar.f41819d = childAt.getRotationY();
                    eVar.f41820e = childAt.getScaleX();
                    eVar.f41821f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        eVar.f41822g = pivotX;
                        eVar.f41823h = pivotY;
                    }
                    eVar.f41825j = childAt.getTranslationX();
                    eVar.f41826k = childAt.getTranslationY();
                    eVar.f41827l = childAt.getTranslationZ();
                    if (eVar.f41828m) {
                        eVar.f41829n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public final void W(d dVar) {
        for (Integer num : dVar.f41706f.keySet()) {
            num.getClass();
            a aVar = dVar.f41706f.get(num);
            HashMap<Integer, a> hashMap = this.f41706f;
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, new a());
            }
            a aVar2 = hashMap.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.f41711e;
                if (!bVar.f41756b) {
                    bVar.a(aVar.f41711e);
                }
                C0759d c0759d = aVar2.f41709c;
                if (!c0759d.f41810a) {
                    C0759d c0759d2 = aVar.f41709c;
                    c0759d.f41810a = c0759d2.f41810a;
                    c0759d.f41811b = c0759d2.f41811b;
                    c0759d.f41813d = c0759d2.f41813d;
                    c0759d.f41814e = c0759d2.f41814e;
                    c0759d.f41812c = c0759d2.f41812c;
                }
                e eVar = aVar2.f41712f;
                if (!eVar.f41816a) {
                    eVar.a(aVar.f41712f);
                }
                c cVar = aVar2.f41710d;
                if (!cVar.f41797a) {
                    cVar.a(aVar.f41710d);
                }
                for (String str : aVar.f41713g.keySet()) {
                    if (!aVar2.f41713g.containsKey(str)) {
                        aVar2.f41713g.put(str, aVar.f41713g.get(str));
                    }
                }
            }
        }
    }

    public final void X(int i11, String str) {
        H(i11).f41711e.f41795z = str;
    }

    public final void Y() {
        this.f41705e = false;
    }

    public final void Z(int i11, int i12, int i13) {
        a H11 = H(i11);
        switch (i12) {
            case 1:
                H11.f41711e.f41741N = i13;
                return;
            case 2:
                H11.f41711e.f41743P = i13;
                return;
            case 3:
                H11.f41711e.f41742O = i13;
                return;
            case 4:
                H11.f41711e.f41744Q = i13;
                return;
            case 5:
                H11.f41711e.f41747T = i13;
                return;
            case 6:
                H11.f41711e.f41746S = i13;
                return;
            case 7:
                H11.f41711e.f41745R = i13;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void a0(int i11, int i12) {
        H(i11).f41711e.f41762e = i12;
        H(i11).f41711e.f41764f = -1;
        H(i11).f41711e.f41766g = -1.0f;
    }

    public final void b0(float f7, int i11) {
        H(i11).f41711e.f41766g = f7;
        H(i11).f41711e.f41764f = -1;
        H(i11).f41711e.f41762e = -1;
    }

    public final void c(int i11, int i12, int i13) {
        t(i11, 1, i12, i12 == 0 ? 1 : 2, 0);
        t(i11, 2, i13, i13 == 0 ? 2 : 1, 0);
        if (i12 != 0) {
            t(i12, 2, i11, 1, 0);
        }
        if (i13 != 0) {
            t(i13, 1, i11, 2, 0);
        }
    }

    public final void c0(float f7, int i11) {
        H(i11).f41711e.f41793x = f7;
    }

    public final void d(MotionLayout motionLayout) {
        a aVar;
        int childCount = motionLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = motionLayout.getChildAt(i11);
            int id2 = childAt.getId();
            HashMap<Integer, a> hashMap = this.f41706f;
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + C8834a.d(childAt));
            } else {
                if (this.f41705e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (hashMap.containsKey(Integer.valueOf(id2)) && (aVar = hashMap.get(Integer.valueOf(id2))) != null) {
                    androidx.constraintlayout.widget.a.i(childAt, aVar.f41713g);
                }
            }
        }
    }

    public final void d0(int i11, int i12) {
        H(i11).f41711e.f41750W = i12;
    }

    public final void e(d dVar) {
        for (a aVar : dVar.f41706f.values()) {
            if (aVar.f41714h != null) {
                if (aVar.f41708b != null) {
                    Iterator<Integer> it = this.f41706f.keySet().iterator();
                    while (it.hasNext()) {
                        a I11 = I(it.next().intValue());
                        String str = I11.f41711e.f41777l0;
                        if (str != null && aVar.f41708b.matches(str)) {
                            aVar.f41714h.e(I11);
                            I11.f41713g.putAll((HashMap) aVar.f41713g.clone());
                        }
                    }
                } else {
                    aVar.f41714h.e(I(aVar.f41707a));
                }
            }
        }
    }

    public final void e0(int i11, int i12, int i13) {
        a H11 = H(i11);
        switch (i12) {
            case 1:
                H11.f41711e.f41734G = i13;
                return;
            case 2:
                H11.f41711e.f41735H = i13;
                return;
            case 3:
                H11.f41711e.f41736I = i13;
                return;
            case 4:
                H11.f41711e.f41737J = i13;
                return;
            case 5:
                H11.f41711e.f41740M = i13;
                return;
            case 6:
                H11.f41711e.f41739L = i13;
                return;
            case 7:
                H11.f41711e.f41738K = i13;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        h(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void f0(float f7, int i11) {
        H(i11).f41711e.f41794y = f7;
    }

    public final void g(androidx.constraintlayout.widget.b bVar, m2.e eVar, e.a aVar, SparseArray sparseArray) {
        a aVar2;
        int id2 = bVar.getId();
        HashMap<Integer, a> hashMap = this.f41706f;
        if (hashMap.containsKey(Integer.valueOf(id2)) && (aVar2 = hashMap.get(Integer.valueOf(id2))) != null && (eVar instanceof m2.j)) {
            bVar.loadParameters(aVar2, (m2.j) eVar, aVar, sparseArray);
        }
    }

    public final void g0(int i11, int i12) {
        H(i11).f41711e.f41751X = i12;
    }

    final void h(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = this.f41706f;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + C8834a.d(childAt));
            } else {
                if (this.f41705e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = hashMap.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                b bVar = aVar.f41711e;
                                bVar.f41771i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.f(bVar.f41767g0);
                                barrier.e(bVar.f41769h0);
                                barrier.d(bVar.f41783o0);
                                int[] iArr = bVar.f41773j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f41775k0;
                                    if (str != null) {
                                        int[] D11 = D(barrier, str);
                                        bVar.f41773j0 = D11;
                                        barrier.setReferencedIds(D11);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.b();
                            aVar.e(bVar2);
                            androidx.constraintlayout.widget.a.i(childAt, aVar.f41713g);
                            childAt.setLayoutParams(bVar2);
                            C0759d c0759d = aVar.f41709c;
                            if (c0759d.f41812c == 0) {
                                childAt.setVisibility(c0759d.f41811b);
                            }
                            childAt.setAlpha(c0759d.f41813d);
                            e eVar = aVar.f41712f;
                            childAt.setRotation(eVar.f41817b);
                            childAt.setRotationX(eVar.f41818c);
                            childAt.setRotationY(eVar.f41819d);
                            childAt.setScaleX(eVar.f41820e);
                            childAt.setScaleY(eVar.f41821f);
                            if (eVar.f41824i != -1) {
                                if (((View) childAt.getParent()).findViewById(eVar.f41824i) != null) {
                                    float bottom = (r7.getBottom() + r7.getTop()) / 2.0f;
                                    float right = (r7.getRight() + r7.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f41822g)) {
                                    childAt.setPivotX(eVar.f41822g);
                                }
                                if (!Float.isNaN(eVar.f41823h)) {
                                    childAt.setPivotY(eVar.f41823h);
                                }
                            }
                            childAt.setTranslationX(eVar.f41825j);
                            childAt.setTranslationY(eVar.f41826k);
                            childAt.setTranslationZ(eVar.f41827l);
                            if (eVar.f41828m) {
                                childAt.setElevation(eVar.f41829n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = hashMap.get(num);
            if (aVar2 != null) {
                b bVar3 = aVar2.f41711e;
                if (bVar3.f41771i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar3.f41773j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f41775k0;
                        if (str2 != null) {
                            int[] D12 = D(barrier2, str2);
                            bVar3.f41773j0 = D12;
                            barrier2.setReferencedIds(D12);
                        }
                    }
                    barrier2.f(bVar3.f41767g0);
                    barrier2.e(bVar3.f41769h0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    aVar2.e(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (bVar3.f41754a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.e(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).applyLayoutFeaturesInConstraintSet(constraintLayout);
            }
        }
    }

    public final void h0(int i11, int i12) {
        H(i11).f41709c.f41811b = i12;
    }

    public final void i(int i11, e.a aVar) {
        a aVar2;
        HashMap<Integer, a> hashMap = this.f41706f;
        if (!hashMap.containsKey(Integer.valueOf(i11)) || (aVar2 = hashMap.get(Integer.valueOf(i11))) == null) {
            return;
        }
        aVar2.e(aVar);
    }

    public final void i0(int i11) {
        H(i11).f41709c.f41812c = 1;
    }

    public final void k(int i11, int i12, int i13) {
        HashMap<Integer, a> hashMap = this.f41706f;
        if (i12 == 1 || i12 == 2) {
            t(i11, 1, 0, i12, 0);
            t(i11, 2, 0, i13, 0);
            a aVar = hashMap.get(Integer.valueOf(i11));
            if (aVar != null) {
                aVar.f41711e.f41793x = 0.5f;
                return;
            }
            return;
        }
        if (i12 == 6 || i12 == 7) {
            t(i11, 6, 0, i12, 0);
            t(i11, 7, 0, i13, 0);
            a aVar2 = hashMap.get(Integer.valueOf(i11));
            if (aVar2 != null) {
                aVar2.f41711e.f41793x = 0.5f;
                return;
            }
            return;
        }
        t(i11, 3, 0, i12, 0);
        t(i11, 4, 0, i13, 0);
        a aVar3 = hashMap.get(Integer.valueOf(i11));
        if (aVar3 != null) {
            aVar3.f41711e.f41794y = 0.5f;
        }
    }

    public final void l(int i11) {
        k(i11, 1, 2);
    }

    public final void m(int i11) {
        k(i11, 3, 4);
    }

    public final void n(int i11) {
        this.f41706f.remove(Integer.valueOf(i11));
    }

    public final void o(int i11, int i12) {
        a aVar;
        HashMap<Integer, a> hashMap = this.f41706f;
        if (!hashMap.containsKey(Integer.valueOf(i11)) || (aVar = hashMap.get(Integer.valueOf(i11))) == null) {
            return;
        }
        b bVar = aVar.f41711e;
        switch (i12) {
            case 1:
                bVar.f41772j = -1;
                bVar.f41770i = -1;
                bVar.f41734G = -1;
                bVar.f41741N = LinearLayoutManager.INVALID_OFFSET;
                return;
            case 2:
                bVar.f41776l = -1;
                bVar.f41774k = -1;
                bVar.f41735H = -1;
                bVar.f41743P = LinearLayoutManager.INVALID_OFFSET;
                return;
            case 3:
                bVar.f41780n = -1;
                bVar.f41778m = -1;
                bVar.f41736I = 0;
                bVar.f41742O = LinearLayoutManager.INVALID_OFFSET;
                return;
            case 4:
                bVar.f41782o = -1;
                bVar.f41784p = -1;
                bVar.f41737J = 0;
                bVar.f41744Q = LinearLayoutManager.INVALID_OFFSET;
                return;
            case 5:
                bVar.f41786q = -1;
                bVar.f41787r = -1;
                bVar.f41788s = -1;
                bVar.f41740M = 0;
                bVar.f41747T = LinearLayoutManager.INVALID_OFFSET;
                return;
            case 6:
                bVar.f41789t = -1;
                bVar.f41790u = -1;
                bVar.f41739L = 0;
                bVar.f41746S = LinearLayoutManager.INVALID_OFFSET;
                return;
            case 7:
                bVar.f41791v = -1;
                bVar.f41792w = -1;
                bVar.f41738K = 0;
                bVar.f41745R = LinearLayoutManager.INVALID_OFFSET;
                return;
            case 8:
                bVar.f41730C = -1.0f;
                bVar.f41729B = -1;
                bVar.f41728A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void p(ConstraintLayout constraintLayout) {
        int i11;
        int i12;
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = dVar.f41706f;
        hashMap.clear();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = constraintLayout.getChildAt(i13);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (dVar.f41705e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new a());
            }
            a aVar = hashMap.get(Integer.valueOf(id2));
            if (aVar == null) {
                i11 = childCount;
            } else {
                HashMap<String, androidx.constraintlayout.widget.a> hashMap2 = dVar.f41704d;
                HashMap<String, androidx.constraintlayout.widget.a> hashMap3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    androidx.constraintlayout.widget.a aVar2 = hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new androidx.constraintlayout.widget.a(aVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i12 = childCount;
                        } else {
                            i12 = childCount;
                            try {
                                hashMap3.put(str, new androidx.constraintlayout.widget.a(aVar2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e11) {
                                e = e11;
                                e.printStackTrace();
                                childCount = i12;
                            } catch (NoSuchMethodException e12) {
                                e = e12;
                                e.printStackTrace();
                                childCount = i12;
                            } catch (InvocationTargetException e13) {
                                e = e13;
                                e.printStackTrace();
                                childCount = i12;
                            }
                        }
                    } catch (IllegalAccessException e14) {
                        e = e14;
                        i12 = childCount;
                    } catch (NoSuchMethodException e15) {
                        e = e15;
                        i12 = childCount;
                    } catch (InvocationTargetException e16) {
                        e = e16;
                        i12 = childCount;
                    }
                    childCount = i12;
                }
                i11 = childCount;
                aVar.f41713g = hashMap3;
                aVar.g(id2, bVar);
                int visibility = childAt.getVisibility();
                C0759d c0759d = aVar.f41709c;
                c0759d.f41811b = visibility;
                c0759d.f41813d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar.f41712f;
                eVar.f41817b = rotation;
                eVar.f41818c = childAt.getRotationX();
                eVar.f41819d = childAt.getRotationY();
                eVar.f41820e = childAt.getScaleX();
                eVar.f41821f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f41822g = pivotX;
                    eVar.f41823h = pivotY;
                }
                eVar.f41825j = childAt.getTranslationX();
                eVar.f41826k = childAt.getTranslationY();
                eVar.f41827l = childAt.getTranslationZ();
                if (eVar.f41828m) {
                    eVar.f41829n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean a11 = barrier.a();
                    b bVar2 = aVar.f41711e;
                    bVar2.f41783o0 = a11;
                    bVar2.f41773j0 = barrier.getReferencedIds();
                    bVar2.f41767g0 = barrier.c();
                    bVar2.f41769h0 = barrier.b();
                }
            }
            i13++;
            dVar = this;
            childCount = i11;
        }
    }

    public final void q(d dVar) {
        HashMap<Integer, a> hashMap = this.f41706f;
        hashMap.clear();
        for (Integer num : dVar.f41706f.keySet()) {
            a aVar = dVar.f41706f.get(num);
            if (aVar != null) {
                hashMap.put(num, aVar.clone());
            }
        }
    }

    public final void r(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        HashMap<Integer, a> hashMap = this.f41706f;
        hashMap.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = eVar.getChildAt(i11);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f41705e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = hashMap.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    a.b(aVar2, (androidx.constraintlayout.widget.b) childAt, id2, aVar);
                }
                aVar2.h(id2, aVar);
            }
        }
    }

    public final void s(int i11, int i12, int i13, int i14) {
        HashMap<Integer, a> hashMap = this.f41706f;
        if (!hashMap.containsKey(Integer.valueOf(i11))) {
            hashMap.put(Integer.valueOf(i11), new a());
        }
        a aVar = hashMap.get(Integer.valueOf(i11));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.f41711e;
        switch (i12) {
            case 1:
                if (i14 == 1) {
                    bVar.f41770i = i13;
                    bVar.f41772j = -1;
                    return;
                } else {
                    if (i14 != 2) {
                        throw new IllegalArgumentException(o0.c(new StringBuilder("left to "), j0(i14), " undefined"));
                    }
                    bVar.f41772j = i13;
                    bVar.f41770i = -1;
                    return;
                }
            case 2:
                if (i14 == 1) {
                    bVar.f41774k = i13;
                    bVar.f41776l = -1;
                    return;
                } else {
                    if (i14 != 2) {
                        throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                    }
                    bVar.f41776l = i13;
                    bVar.f41774k = -1;
                    return;
                }
            case 3:
                if (i14 == 3) {
                    bVar.f41778m = i13;
                    bVar.f41780n = -1;
                    bVar.f41786q = -1;
                    bVar.f41787r = -1;
                    bVar.f41788s = -1;
                    return;
                }
                if (i14 != 4) {
                    throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                }
                bVar.f41780n = i13;
                bVar.f41778m = -1;
                bVar.f41786q = -1;
                bVar.f41787r = -1;
                bVar.f41788s = -1;
                return;
            case 4:
                if (i14 == 4) {
                    bVar.f41784p = i13;
                    bVar.f41782o = -1;
                    bVar.f41786q = -1;
                    bVar.f41787r = -1;
                    bVar.f41788s = -1;
                    return;
                }
                if (i14 != 3) {
                    throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                }
                bVar.f41782o = i13;
                bVar.f41784p = -1;
                bVar.f41786q = -1;
                bVar.f41787r = -1;
                bVar.f41788s = -1;
                return;
            case 5:
                if (i14 == 5) {
                    bVar.f41786q = i13;
                    bVar.f41784p = -1;
                    bVar.f41782o = -1;
                    bVar.f41778m = -1;
                    bVar.f41780n = -1;
                    return;
                }
                if (i14 == 3) {
                    bVar.f41787r = i13;
                    bVar.f41784p = -1;
                    bVar.f41782o = -1;
                    bVar.f41778m = -1;
                    bVar.f41780n = -1;
                    return;
                }
                if (i14 != 4) {
                    throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                }
                bVar.f41788s = i13;
                bVar.f41784p = -1;
                bVar.f41782o = -1;
                bVar.f41778m = -1;
                bVar.f41780n = -1;
                return;
            case 6:
                if (i14 == 6) {
                    bVar.f41790u = i13;
                    bVar.f41789t = -1;
                    return;
                } else {
                    if (i14 != 7) {
                        throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                    }
                    bVar.f41789t = i13;
                    bVar.f41790u = -1;
                    return;
                }
            case 7:
                if (i14 == 7) {
                    bVar.f41792w = i13;
                    bVar.f41791v = -1;
                    return;
                } else {
                    if (i14 != 6) {
                        throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                    }
                    bVar.f41791v = i13;
                    bVar.f41792w = -1;
                    return;
                }
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j0(i12));
                sb2.append(" to ");
                throw new IllegalArgumentException(o0.c(sb2, j0(i14), " unknown"));
        }
    }

    public final void t(int i11, int i12, int i13, int i14, int i15) {
        HashMap<Integer, a> hashMap = this.f41706f;
        if (!hashMap.containsKey(Integer.valueOf(i11))) {
            hashMap.put(Integer.valueOf(i11), new a());
        }
        a aVar = hashMap.get(Integer.valueOf(i11));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.f41711e;
        switch (i12) {
            case 1:
                if (i14 == 1) {
                    bVar.f41770i = i13;
                    bVar.f41772j = -1;
                } else {
                    if (i14 != 2) {
                        throw new IllegalArgumentException(o0.c(new StringBuilder("Left to "), j0(i14), " undefined"));
                    }
                    bVar.f41772j = i13;
                    bVar.f41770i = -1;
                }
                bVar.f41734G = i15;
                return;
            case 2:
                if (i14 == 1) {
                    bVar.f41774k = i13;
                    bVar.f41776l = -1;
                } else {
                    if (i14 != 2) {
                        throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                    }
                    bVar.f41776l = i13;
                    bVar.f41774k = -1;
                }
                bVar.f41735H = i15;
                return;
            case 3:
                if (i14 == 3) {
                    bVar.f41778m = i13;
                    bVar.f41780n = -1;
                    bVar.f41786q = -1;
                    bVar.f41787r = -1;
                    bVar.f41788s = -1;
                } else {
                    if (i14 != 4) {
                        throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                    }
                    bVar.f41780n = i13;
                    bVar.f41778m = -1;
                    bVar.f41786q = -1;
                    bVar.f41787r = -1;
                    bVar.f41788s = -1;
                }
                bVar.f41736I = i15;
                return;
            case 4:
                if (i14 == 4) {
                    bVar.f41784p = i13;
                    bVar.f41782o = -1;
                    bVar.f41786q = -1;
                    bVar.f41787r = -1;
                    bVar.f41788s = -1;
                } else {
                    if (i14 != 3) {
                        throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                    }
                    bVar.f41782o = i13;
                    bVar.f41784p = -1;
                    bVar.f41786q = -1;
                    bVar.f41787r = -1;
                    bVar.f41788s = -1;
                }
                bVar.f41737J = i15;
                return;
            case 5:
                if (i14 == 5) {
                    bVar.f41786q = i13;
                    bVar.f41784p = -1;
                    bVar.f41782o = -1;
                    bVar.f41778m = -1;
                    bVar.f41780n = -1;
                    return;
                }
                if (i14 == 3) {
                    bVar.f41787r = i13;
                    bVar.f41784p = -1;
                    bVar.f41782o = -1;
                    bVar.f41778m = -1;
                    bVar.f41780n = -1;
                    return;
                }
                if (i14 != 4) {
                    throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                }
                bVar.f41788s = i13;
                bVar.f41784p = -1;
                bVar.f41782o = -1;
                bVar.f41778m = -1;
                bVar.f41780n = -1;
                return;
            case 6:
                if (i14 == 6) {
                    bVar.f41790u = i13;
                    bVar.f41789t = -1;
                } else {
                    if (i14 != 7) {
                        throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                    }
                    bVar.f41789t = i13;
                    bVar.f41790u = -1;
                }
                bVar.f41739L = i15;
                return;
            case 7:
                if (i14 == 7) {
                    bVar.f41792w = i13;
                    bVar.f41791v = -1;
                } else {
                    if (i14 != 6) {
                        throw new IllegalArgumentException(o0.c(new StringBuilder("right to "), j0(i14), " undefined"));
                    }
                    bVar.f41791v = i13;
                    bVar.f41792w = -1;
                }
                bVar.f41738K = i15;
                return;
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j0(i12));
                sb2.append(" to ");
                throw new IllegalArgumentException(o0.c(sb2, j0(i14), " unknown"));
        }
    }

    public final void u(float f7, int i11, int i12) {
        b bVar = H(i11).f41711e;
        bVar.f41728A = R.id.circle_center;
        bVar.f41729B = i12;
        bVar.f41730C = f7;
    }

    public final void v(int i11, int i12) {
        H(i11).f41711e.f41752Y = i12;
    }

    public final void w(int i11, int i12) {
        H(i11).f41711e.f41760d = i12;
    }

    public final void x(int i11, int i12) {
        H(i11).f41711e.f41761d0 = i12;
    }

    public final void y(int i11, int i12) {
        H(i11).f41711e.f41759c0 = i12;
    }

    public final void z(float f7, int i11) {
        H(i11).f41711e.f41763e0 = f7;
    }
}
