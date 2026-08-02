package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.gms.internal.ads.zzbbd;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import u.C1616e;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f904g = {0, 4, 8};

    /* renamed from: h, reason: collision with root package name */
    public static final SparseIntArray f905h;

    /* renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f906i;

    /* renamed from: a, reason: collision with root package name */
    public String f907a;

    /* renamed from: b, reason: collision with root package name */
    public String f908b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f909c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f910d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f911e = true;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f912f = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f905h = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f906i = sparseIntArray2;
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
        sparseIntArray.append(ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE, 6);
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
        sparseIntArray2.append(ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE, 86);
        sparseIntArray2.append(94, 97);
    }

    public static h d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        h hVar = new h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, q.f935f);
        o(hVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return hVar;
    }

    public static int[] f(Barrier barrier, String str) {
        int i7;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i8 = 0;
        int i9 = 0;
        while (i8 < split.length) {
            String trim = split[i8].trim();
            Object obj = null;
            try {
                i7 = p.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i7 = 0;
            }
            if (i7 == 0) {
                i7 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i7 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f9002D;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f9002D.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i7 = ((Integer) obj).intValue();
                }
            }
            iArr[i9] = i7;
            i8++;
            i9++;
        }
        return i9 != split.length ? Arrays.copyOf(iArr, i9) : iArr;
    }

    public static h g(Context context, AttributeSet attributeSet, boolean z4) {
        h hVar = new h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4 ? q.f935f : q.f931b);
        if (z4) {
            o(hVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i7 = 0;
            while (true) {
                i iVar = hVar.f801e;
                if (i7 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i7);
                    k kVar = hVar.f799c;
                    l lVar = hVar.f802f;
                    j jVar = hVar.f800d;
                    if (index != 1 && 23 != index && 24 != index) {
                        jVar.f873a = true;
                        iVar.f834b = true;
                        kVar.f885a = true;
                        lVar.f891a = true;
                    }
                    SparseIntArray sparseIntArray = f905h;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            iVar.f862q = l(obtainStyledAttributes, index, iVar.f862q);
                            break;
                        case 2:
                            iVar.f815J = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f815J);
                            break;
                        case 3:
                            iVar.f860p = l(obtainStyledAttributes, index, iVar.f860p);
                            break;
                        case 4:
                            iVar.f858o = l(obtainStyledAttributes, index, iVar.f858o);
                            break;
                        case 5:
                            iVar.f871z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            iVar.f809D = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.f809D);
                            break;
                        case 7:
                            iVar.f810E = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.f810E);
                            break;
                        case 8:
                            iVar.f816K = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f816K);
                            break;
                        case 9:
                            iVar.f868w = l(obtainStyledAttributes, index, iVar.f868w);
                            break;
                        case 10:
                            iVar.f867v = l(obtainStyledAttributes, index, iVar.f867v);
                            break;
                        case 11:
                            iVar.f822Q = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f822Q);
                            break;
                        case 12:
                            iVar.f823R = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f823R);
                            break;
                        case 13:
                            iVar.f819N = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f819N);
                            break;
                        case 14:
                            iVar.f821P = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f821P);
                            break;
                        case 15:
                            iVar.f824S = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f824S);
                            break;
                        case 16:
                            iVar.f820O = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f820O);
                            break;
                        case 17:
                            iVar.f839e = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.f839e);
                            break;
                        case 18:
                            iVar.f841f = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.f841f);
                            break;
                        case 19:
                            iVar.f843g = obtainStyledAttributes.getFloat(index, iVar.f843g);
                            break;
                        case 20:
                            iVar.f869x = obtainStyledAttributes.getFloat(index, iVar.f869x);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            iVar.f837d = obtainStyledAttributes.getLayoutDimension(index, iVar.f837d);
                            break;
                        case 22:
                            int i8 = obtainStyledAttributes.getInt(index, kVar.f886b);
                            kVar.f886b = i8;
                            kVar.f886b = f904g[i8];
                            break;
                        case 23:
                            iVar.f836c = obtainStyledAttributes.getLayoutDimension(index, iVar.f836c);
                            break;
                        case 24:
                            iVar.f812G = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f812G);
                            break;
                        case 25:
                            iVar.f847i = l(obtainStyledAttributes, index, iVar.f847i);
                            break;
                        case 26:
                            iVar.j = l(obtainStyledAttributes, index, iVar.j);
                            break;
                        case 27:
                            iVar.f811F = obtainStyledAttributes.getInt(index, iVar.f811F);
                            break;
                        case 28:
                            iVar.f813H = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f813H);
                            break;
                        case 29:
                            iVar.f850k = l(obtainStyledAttributes, index, iVar.f850k);
                            break;
                        case 30:
                            iVar.f852l = l(obtainStyledAttributes, index, iVar.f852l);
                            break;
                        case 31:
                            iVar.f817L = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f817L);
                            break;
                        case 32:
                            iVar.f865t = l(obtainStyledAttributes, index, iVar.f865t);
                            break;
                        case 33:
                            iVar.f866u = l(obtainStyledAttributes, index, iVar.f866u);
                            break;
                        case 34:
                            iVar.f814I = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f814I);
                            break;
                        case 35:
                            iVar.f856n = l(obtainStyledAttributes, index, iVar.f856n);
                            break;
                        case 36:
                            iVar.f854m = l(obtainStyledAttributes, index, iVar.f854m);
                            break;
                        case 37:
                            iVar.f870y = obtainStyledAttributes.getFloat(index, iVar.f870y);
                            break;
                        case 38:
                            hVar.f797a = obtainStyledAttributes.getResourceId(index, hVar.f797a);
                            break;
                        case 39:
                            iVar.f827V = obtainStyledAttributes.getFloat(index, iVar.f827V);
                            break;
                        case 40:
                            iVar.f826U = obtainStyledAttributes.getFloat(index, iVar.f826U);
                            break;
                        case 41:
                            iVar.f828W = obtainStyledAttributes.getInt(index, iVar.f828W);
                            break;
                        case 42:
                            iVar.f829X = obtainStyledAttributes.getInt(index, iVar.f829X);
                            break;
                        case 43:
                            kVar.f888d = obtainStyledAttributes.getFloat(index, kVar.f888d);
                            break;
                        case 44:
                            lVar.f902m = true;
                            lVar.f903n = obtainStyledAttributes.getDimension(index, lVar.f903n);
                            break;
                        case 45:
                            lVar.f893c = obtainStyledAttributes.getFloat(index, lVar.f893c);
                            break;
                        case 46:
                            lVar.f894d = obtainStyledAttributes.getFloat(index, lVar.f894d);
                            break;
                        case 47:
                            lVar.f895e = obtainStyledAttributes.getFloat(index, lVar.f895e);
                            break;
                        case 48:
                            lVar.f896f = obtainStyledAttributes.getFloat(index, lVar.f896f);
                            break;
                        case 49:
                            lVar.f897g = obtainStyledAttributes.getDimension(index, lVar.f897g);
                            break;
                        case 50:
                            lVar.f898h = obtainStyledAttributes.getDimension(index, lVar.f898h);
                            break;
                        case 51:
                            lVar.j = obtainStyledAttributes.getDimension(index, lVar.j);
                            break;
                        case 52:
                            lVar.f900k = obtainStyledAttributes.getDimension(index, lVar.f900k);
                            break;
                        case 53:
                            lVar.f901l = obtainStyledAttributes.getDimension(index, lVar.f901l);
                            break;
                        case 54:
                            iVar.f830Y = obtainStyledAttributes.getInt(index, iVar.f830Y);
                            break;
                        case 55:
                            iVar.f831Z = obtainStyledAttributes.getInt(index, iVar.f831Z);
                            break;
                        case 56:
                            iVar.f833a0 = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f833a0);
                            break;
                        case 57:
                            iVar.f835b0 = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f835b0);
                            break;
                        case 58:
                            iVar.c0 = obtainStyledAttributes.getDimensionPixelSize(index, iVar.c0);
                            break;
                        case 59:
                            iVar.f838d0 = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f838d0);
                            break;
                        case 60:
                            lVar.f892b = obtainStyledAttributes.getFloat(index, lVar.f892b);
                            break;
                        case 61:
                            iVar.f806A = l(obtainStyledAttributes, index, iVar.f806A);
                            break;
                        case 62:
                            iVar.f807B = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f807B);
                            break;
                        case 63:
                            iVar.f808C = obtainStyledAttributes.getFloat(index, iVar.f808C);
                            break;
                        case 64:
                            jVar.f874b = l(obtainStyledAttributes, index, jVar.f874b);
                            break;
                        case 65:
                            if (obtainStyledAttributes.peekValue(index).type != 3) {
                                jVar.f876d = C1616e.f16501d[obtainStyledAttributes.getInteger(index, 0)];
                                break;
                            } else {
                                jVar.f876d = obtainStyledAttributes.getString(index);
                                break;
                            }
                        case 66:
                            jVar.f878f = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            jVar.f880h = obtainStyledAttributes.getFloat(index, jVar.f880h);
                            break;
                        case 68:
                            kVar.f889e = obtainStyledAttributes.getFloat(index, kVar.f889e);
                            break;
                        case 69:
                            iVar.f840e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            iVar.f842f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            iVar.f844g0 = obtainStyledAttributes.getInt(index, iVar.f844g0);
                            break;
                        case 73:
                            iVar.f846h0 = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f846h0);
                            break;
                        case 74:
                            iVar.f851k0 = obtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            iVar.f859o0 = obtainStyledAttributes.getBoolean(index, iVar.f859o0);
                            break;
                        case 76:
                            jVar.f877e = obtainStyledAttributes.getInt(index, jVar.f877e);
                            break;
                        case 77:
                            iVar.f853l0 = obtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            kVar.f887c = obtainStyledAttributes.getInt(index, kVar.f887c);
                            break;
                        case 79:
                            jVar.f879g = obtainStyledAttributes.getFloat(index, jVar.f879g);
                            break;
                        case 80:
                            iVar.f855m0 = obtainStyledAttributes.getBoolean(index, iVar.f855m0);
                            break;
                        case 81:
                            iVar.f857n0 = obtainStyledAttributes.getBoolean(index, iVar.f857n0);
                            break;
                        case 82:
                            jVar.f875c = obtainStyledAttributes.getInteger(index, jVar.f875c);
                            break;
                        case 83:
                            lVar.f899i = l(obtainStyledAttributes, index, lVar.f899i);
                            break;
                        case 84:
                            jVar.j = obtainStyledAttributes.getInteger(index, jVar.j);
                            break;
                        case 85:
                            jVar.f881i = obtainStyledAttributes.getFloat(index, jVar.f881i);
                            break;
                        case 86:
                            int i9 = obtainStyledAttributes.peekValue(index).type;
                            if (i9 != 1) {
                                if (i9 != 3) {
                                    jVar.f883l = obtainStyledAttributes.getInteger(index, jVar.f884m);
                                    break;
                                } else {
                                    String string = obtainStyledAttributes.getString(index);
                                    jVar.f882k = string;
                                    if (string.indexOf("/") <= 0) {
                                        jVar.f883l = -1;
                                        break;
                                    } else {
                                        jVar.f884m = obtainStyledAttributes.getResourceId(index, -1);
                                        jVar.f883l = -2;
                                        break;
                                    }
                                }
                            } else {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                jVar.f884m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    jVar.f883l = -2;
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
                            iVar.f863r = l(obtainStyledAttributes, index, iVar.f863r);
                            break;
                        case 92:
                            iVar.f864s = l(obtainStyledAttributes, index, iVar.f864s);
                            break;
                        case 93:
                            iVar.f818M = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f818M);
                            break;
                        case 94:
                            iVar.f825T = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f825T);
                            break;
                        case 95:
                            m(iVar, obtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            m(iVar, obtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            iVar.f861p0 = obtainStyledAttributes.getInt(index, iVar.f861p0);
                            break;
                    }
                    i7++;
                } else if (iVar.f851k0 != null) {
                    iVar.f849j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return hVar;
    }

    public static int l(TypedArray typedArray, int i7, int i8) {
        int resourceId = typedArray.getResourceId(i7, i8);
        return resourceId == -1 ? typedArray.getInt(i7, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Object obj, TypedArray typedArray, int i7, int i8) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i9 = typedArray.peekValue(i7).type;
        boolean z4 = true;
        int i10 = 0;
        if (i9 == 3) {
            String string = typedArray.getString(i7);
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
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        if (i8 == 0) {
                            ((ViewGroup.MarginLayoutParams) cVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) cVar).height = 0;
                        }
                        n(cVar, trim2);
                        return;
                    }
                    if (obj instanceof i) {
                        ((i) obj).f871z = trim2;
                        return;
                    } else {
                        if (obj instanceof g) {
                            ((g) obj).c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof c) {
                            c cVar2 = (c) obj;
                            if (i8 == 0) {
                                ((ViewGroup.MarginLayoutParams) cVar2).width = 0;
                                cVar2.f708H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) cVar2).height = 0;
                                cVar2.f709I = parseFloat;
                            }
                        } else if (obj instanceof i) {
                            i iVar = (i) obj;
                            if (i8 == 0) {
                                iVar.f836c = 0;
                                iVar.f827V = parseFloat;
                            } else {
                                iVar.f837d = 0;
                                iVar.f826U = parseFloat;
                            }
                        } else if (obj instanceof g) {
                            g gVar = (g) obj;
                            if (i8 == 0) {
                                gVar.b(23, 0);
                                gVar.a(parseFloat, 39);
                            } else {
                                gVar.b(21, 0);
                                gVar.a(parseFloat, 40);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof c) {
                            c cVar3 = (c) obj;
                            if (i8 == 0) {
                                ((ViewGroup.MarginLayoutParams) cVar3).width = 0;
                                cVar3.f718R = max;
                                cVar3.f712L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) cVar3).height = 0;
                                cVar3.f719S = max;
                                cVar3.f713M = 2;
                            }
                        } else if (obj instanceof i) {
                            i iVar2 = (i) obj;
                            if (i8 == 0) {
                                iVar2.f836c = 0;
                                iVar2.f840e0 = max;
                                iVar2.f830Y = 2;
                            } else {
                                iVar2.f837d = 0;
                                iVar2.f842f0 = max;
                                iVar2.f831Z = 2;
                            }
                        } else if (obj instanceof g) {
                            g gVar2 = (g) obj;
                            if (i8 == 0) {
                                gVar2.b(23, 0);
                                gVar2.b(54, 2);
                            } else {
                                gVar2.b(21, 0);
                                gVar2.b(55, 2);
                            }
                        }
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i9 != 5) {
            dimensionPixelSize = typedArray.getInt(i7, 0);
            if (dimensionPixelSize == -4) {
                i10 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z4 = false;
            }
            if (!(obj instanceof c)) {
                c cVar4 = (c) obj;
                if (i8 == 0) {
                    ((ViewGroup.MarginLayoutParams) cVar4).width = i10;
                    cVar4.f723W = z4;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) cVar4).height = i10;
                    cVar4.f724X = z4;
                    return;
                }
            }
            if (obj instanceof i) {
                i iVar3 = (i) obj;
                if (i8 == 0) {
                    iVar3.f836c = i10;
                    iVar3.f855m0 = z4;
                    return;
                } else {
                    iVar3.f837d = i10;
                    iVar3.f857n0 = z4;
                    return;
                }
            }
            if (obj instanceof g) {
                g gVar3 = (g) obj;
                if (i8 == 0) {
                    gVar3.b(23, i10);
                    gVar3.d(80, z4);
                    return;
                } else {
                    gVar3.b(21, i10);
                    gVar3.d(81, z4);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i7, 0);
        z4 = false;
        i10 = dimensionPixelSize;
        if (!(obj instanceof c)) {
        }
    }

    public static void n(c cVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i7 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i7 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
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
                            if (i7 == 1) {
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
        cVar.f707G = str;
    }

    public static void o(h hVar, TypedArray typedArray) {
        char c3;
        int indexCount = typedArray.getIndexCount();
        g gVar = new g();
        gVar.f786a = new int[10];
        gVar.f787b = new int[10];
        gVar.f788c = 0;
        gVar.f789d = new int[10];
        gVar.f790e = new float[10];
        gVar.f791f = 0;
        gVar.f792g = new int[5];
        gVar.f793h = new String[5];
        gVar.f794i = 0;
        gVar.j = new int[4];
        gVar.f795k = new boolean[4];
        gVar.f796l = 0;
        hVar.f804h = gVar;
        j jVar = hVar.f800d;
        jVar.f873a = false;
        i iVar = hVar.f801e;
        iVar.f834b = false;
        k kVar = hVar.f799c;
        kVar.f885a = false;
        l lVar = hVar.f802f;
        lVar.f891a = false;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArray.getIndex(i7);
            int i8 = f906i.get(index);
            SparseIntArray sparseIntArray = f905h;
            switch (i8) {
                case 2:
                    c3 = 5;
                    gVar.b(2, typedArray.getDimensionPixelSize(index, iVar.f815J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c3 = 5;
                    break;
                case 5:
                    c3 = 5;
                    gVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    gVar.b(6, typedArray.getDimensionPixelOffset(index, iVar.f809D));
                    c3 = 5;
                    break;
                case 7:
                    gVar.b(7, typedArray.getDimensionPixelOffset(index, iVar.f810E));
                    c3 = 5;
                    break;
                case 8:
                    gVar.b(8, typedArray.getDimensionPixelSize(index, iVar.f816K));
                    c3 = 5;
                    break;
                case 11:
                    gVar.b(11, typedArray.getDimensionPixelSize(index, iVar.f822Q));
                    c3 = 5;
                    break;
                case 12:
                    gVar.b(12, typedArray.getDimensionPixelSize(index, iVar.f823R));
                    c3 = 5;
                    break;
                case 13:
                    gVar.b(13, typedArray.getDimensionPixelSize(index, iVar.f819N));
                    c3 = 5;
                    break;
                case 14:
                    gVar.b(14, typedArray.getDimensionPixelSize(index, iVar.f821P));
                    c3 = 5;
                    break;
                case 15:
                    gVar.b(15, typedArray.getDimensionPixelSize(index, iVar.f824S));
                    c3 = 5;
                    break;
                case 16:
                    gVar.b(16, typedArray.getDimensionPixelSize(index, iVar.f820O));
                    c3 = 5;
                    break;
                case 17:
                    gVar.b(17, typedArray.getDimensionPixelOffset(index, iVar.f839e));
                    c3 = 5;
                    break;
                case 18:
                    gVar.b(18, typedArray.getDimensionPixelOffset(index, iVar.f841f));
                    c3 = 5;
                    break;
                case 19:
                    gVar.a(typedArray.getFloat(index, iVar.f843g), 19);
                    c3 = 5;
                    break;
                case 20:
                    gVar.a(typedArray.getFloat(index, iVar.f869x), 20);
                    c3 = 5;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    gVar.b(21, typedArray.getLayoutDimension(index, iVar.f837d));
                    c3 = 5;
                    break;
                case 22:
                    gVar.b(22, f904g[typedArray.getInt(index, kVar.f886b)]);
                    c3 = 5;
                    break;
                case 23:
                    gVar.b(23, typedArray.getLayoutDimension(index, iVar.f836c));
                    c3 = 5;
                    break;
                case 24:
                    gVar.b(24, typedArray.getDimensionPixelSize(index, iVar.f812G));
                    c3 = 5;
                    break;
                case 27:
                    gVar.b(27, typedArray.getInt(index, iVar.f811F));
                    c3 = 5;
                    break;
                case 28:
                    gVar.b(28, typedArray.getDimensionPixelSize(index, iVar.f813H));
                    c3 = 5;
                    break;
                case 31:
                    gVar.b(31, typedArray.getDimensionPixelSize(index, iVar.f817L));
                    c3 = 5;
                    break;
                case 34:
                    gVar.b(34, typedArray.getDimensionPixelSize(index, iVar.f814I));
                    c3 = 5;
                    break;
                case 37:
                    gVar.a(typedArray.getFloat(index, iVar.f870y), 37);
                    c3 = 5;
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, hVar.f797a);
                    hVar.f797a = resourceId;
                    gVar.b(38, resourceId);
                    c3 = 5;
                    break;
                case 39:
                    gVar.a(typedArray.getFloat(index, iVar.f827V), 39);
                    c3 = 5;
                    break;
                case 40:
                    gVar.a(typedArray.getFloat(index, iVar.f826U), 40);
                    c3 = 5;
                    break;
                case 41:
                    gVar.b(41, typedArray.getInt(index, iVar.f828W));
                    c3 = 5;
                    break;
                case 42:
                    gVar.b(42, typedArray.getInt(index, iVar.f829X));
                    c3 = 5;
                    break;
                case 43:
                    gVar.a(typedArray.getFloat(index, kVar.f888d), 43);
                    c3 = 5;
                    break;
                case 44:
                    gVar.d(44, true);
                    gVar.a(typedArray.getDimension(index, lVar.f903n), 44);
                    c3 = 5;
                    break;
                case 45:
                    gVar.a(typedArray.getFloat(index, lVar.f893c), 45);
                    c3 = 5;
                    break;
                case 46:
                    gVar.a(typedArray.getFloat(index, lVar.f894d), 46);
                    c3 = 5;
                    break;
                case 47:
                    gVar.a(typedArray.getFloat(index, lVar.f895e), 47);
                    c3 = 5;
                    break;
                case 48:
                    gVar.a(typedArray.getFloat(index, lVar.f896f), 48);
                    c3 = 5;
                    break;
                case 49:
                    gVar.a(typedArray.getDimension(index, lVar.f897g), 49);
                    c3 = 5;
                    break;
                case 50:
                    gVar.a(typedArray.getDimension(index, lVar.f898h), 50);
                    c3 = 5;
                    break;
                case 51:
                    gVar.a(typedArray.getDimension(index, lVar.j), 51);
                    c3 = 5;
                    break;
                case 52:
                    gVar.a(typedArray.getDimension(index, lVar.f900k), 52);
                    c3 = 5;
                    break;
                case 53:
                    gVar.a(typedArray.getDimension(index, lVar.f901l), 53);
                    c3 = 5;
                    break;
                case 54:
                    gVar.b(54, typedArray.getInt(index, iVar.f830Y));
                    c3 = 5;
                    break;
                case 55:
                    gVar.b(55, typedArray.getInt(index, iVar.f831Z));
                    c3 = 5;
                    break;
                case 56:
                    gVar.b(56, typedArray.getDimensionPixelSize(index, iVar.f833a0));
                    c3 = 5;
                    break;
                case 57:
                    gVar.b(57, typedArray.getDimensionPixelSize(index, iVar.f835b0));
                    c3 = 5;
                    break;
                case 58:
                    gVar.b(58, typedArray.getDimensionPixelSize(index, iVar.c0));
                    c3 = 5;
                    break;
                case 59:
                    gVar.b(59, typedArray.getDimensionPixelSize(index, iVar.f838d0));
                    c3 = 5;
                    break;
                case 60:
                    gVar.a(typedArray.getFloat(index, lVar.f892b), 60);
                    c3 = 5;
                    break;
                case 62:
                    gVar.b(62, typedArray.getDimensionPixelSize(index, iVar.f807B));
                    c3 = 5;
                    break;
                case 63:
                    gVar.a(typedArray.getFloat(index, iVar.f808C), 63);
                    c3 = 5;
                    break;
                case 64:
                    gVar.b(64, l(typedArray, index, jVar.f874b));
                    c3 = 5;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        gVar.c(65, typedArray.getString(index));
                    } else {
                        gVar.c(65, C1616e.f16501d[typedArray.getInteger(index, 0)]);
                    }
                    c3 = 5;
                    break;
                case 66:
                    gVar.b(66, typedArray.getInt(index, 0));
                    c3 = 5;
                    break;
                case 67:
                    gVar.a(typedArray.getFloat(index, jVar.f880h), 67);
                    c3 = 5;
                    break;
                case 68:
                    gVar.a(typedArray.getFloat(index, kVar.f889e), 68);
                    c3 = 5;
                    break;
                case 69:
                    gVar.a(typedArray.getFloat(index, 1.0f), 69);
                    c3 = 5;
                    break;
                case 70:
                    gVar.a(typedArray.getFloat(index, 1.0f), 70);
                    c3 = 5;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    c3 = 5;
                    break;
                case 72:
                    gVar.b(72, typedArray.getInt(index, iVar.f844g0));
                    c3 = 5;
                    break;
                case 73:
                    gVar.b(73, typedArray.getDimensionPixelSize(index, iVar.f846h0));
                    c3 = 5;
                    break;
                case 74:
                    gVar.c(74, typedArray.getString(index));
                    c3 = 5;
                    break;
                case 75:
                    gVar.d(75, typedArray.getBoolean(index, iVar.f859o0));
                    c3 = 5;
                    break;
                case 76:
                    gVar.b(76, typedArray.getInt(index, jVar.f877e));
                    c3 = 5;
                    break;
                case 77:
                    gVar.c(77, typedArray.getString(index));
                    c3 = 5;
                    break;
                case 78:
                    gVar.b(78, typedArray.getInt(index, kVar.f887c));
                    c3 = 5;
                    break;
                case 79:
                    gVar.a(typedArray.getFloat(index, jVar.f879g), 79);
                    c3 = 5;
                    break;
                case 80:
                    gVar.d(80, typedArray.getBoolean(index, iVar.f855m0));
                    c3 = 5;
                    break;
                case 81:
                    gVar.d(81, typedArray.getBoolean(index, iVar.f857n0));
                    c3 = 5;
                    break;
                case 82:
                    gVar.b(82, typedArray.getInteger(index, jVar.f875c));
                    c3 = 5;
                    break;
                case 83:
                    gVar.b(83, l(typedArray, index, lVar.f899i));
                    c3 = 5;
                    break;
                case 84:
                    gVar.b(84, typedArray.getInteger(index, jVar.j));
                    c3 = 5;
                    break;
                case 85:
                    gVar.a(typedArray.getFloat(index, jVar.f881i), 85);
                    c3 = 5;
                    break;
                case 86:
                    int i9 = typedArray.peekValue(index).type;
                    if (i9 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        jVar.f884m = resourceId2;
                        gVar.b(89, resourceId2);
                        if (jVar.f884m != -1) {
                            jVar.f883l = -2;
                            gVar.b(88, -2);
                        }
                    } else if (i9 == 3) {
                        String string = typedArray.getString(index);
                        jVar.f882k = string;
                        gVar.c(90, string);
                        if (jVar.f882k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            jVar.f884m = resourceId3;
                            gVar.b(89, resourceId3);
                            jVar.f883l = -2;
                            gVar.b(88, -2);
                        } else {
                            jVar.f883l = -1;
                            gVar.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, jVar.f884m);
                        jVar.f883l = integer;
                        gVar.b(88, integer);
                    }
                    c3 = 5;
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c3 = 5;
                    break;
                case 93:
                    gVar.b(93, typedArray.getDimensionPixelSize(index, iVar.f818M));
                    c3 = 5;
                    break;
                case 94:
                    gVar.b(94, typedArray.getDimensionPixelSize(index, iVar.f825T));
                    c3 = 5;
                    break;
                case 95:
                    m(gVar, typedArray, index, 0);
                    c3 = 5;
                    break;
                case 96:
                    m(gVar, typedArray, index, 1);
                    c3 = 5;
                    break;
                case 97:
                    gVar.b(97, typedArray.getInt(index, iVar.f861p0));
                    c3 = 5;
                    break;
                case 98:
                    if (MotionLayout.f8824Y0) {
                        int resourceId4 = typedArray.getResourceId(index, hVar.f797a);
                        hVar.f797a = resourceId4;
                        if (resourceId4 == -1) {
                            hVar.f798b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        hVar.f798b = typedArray.getString(index);
                    } else {
                        hVar.f797a = typedArray.getResourceId(index, hVar.f797a);
                    }
                    c3 = 5;
                    break;
                case 99:
                    gVar.d(99, typedArray.getBoolean(index, iVar.f845h));
                    c3 = 5;
                    break;
            }
        }
    }

    public final void a(MotionLayout motionLayout) {
        h hVar;
        int childCount = motionLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = motionLayout.getChildAt(i7);
            int id = childAt.getId();
            HashMap hashMap = this.f912f;
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + p6.c.g(childAt));
            } else {
                if (this.f911e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (hashMap.containsKey(Integer.valueOf(id)) && (hVar = (h) hashMap.get(Integer.valueOf(id))) != null) {
                    a.e(childAt, hVar.f803g);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.f912f;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + p6.c.g(childAt));
            } else {
                if (this.f911e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        h hVar = (h) hashMap.get(Integer.valueOf(id));
                        if (hVar != null) {
                            if (childAt instanceof Barrier) {
                                i iVar = hVar.f801e;
                                iVar.f848i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(iVar.f844g0);
                                barrier.setMargin(iVar.f846h0);
                                barrier.setAllowsGoneWidget(iVar.f859o0);
                                int[] iArr = iVar.f849j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = iVar.f851k0;
                                    if (str != null) {
                                        int[] f7 = f(barrier, str);
                                        iVar.f849j0 = f7;
                                        barrier.setReferencedIds(f7);
                                    }
                                }
                            }
                            c cVar = (c) childAt.getLayoutParams();
                            cVar.a();
                            hVar.a(cVar);
                            a.e(childAt, hVar.f803g);
                            childAt.setLayoutParams(cVar);
                            k kVar = hVar.f799c;
                            if (kVar.f887c == 0) {
                                childAt.setVisibility(kVar.f886b);
                            }
                            childAt.setAlpha(kVar.f888d);
                            l lVar = hVar.f802f;
                            childAt.setRotation(lVar.f892b);
                            childAt.setRotationX(lVar.f893c);
                            childAt.setRotationY(lVar.f894d);
                            childAt.setScaleX(lVar.f895e);
                            childAt.setScaleY(lVar.f896f);
                            if (lVar.f899i != -1) {
                                if (((View) childAt.getParent()).findViewById(lVar.f899i) != null) {
                                    float bottom = (r8.getBottom() + r8.getTop()) / 2.0f;
                                    float right = (r8.getRight() + r8.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(lVar.f897g)) {
                                    childAt.setPivotX(lVar.f897g);
                                }
                                if (!Float.isNaN(lVar.f898h)) {
                                    childAt.setPivotY(lVar.f898h);
                                }
                            }
                            childAt.setTranslationX(lVar.j);
                            childAt.setTranslationY(lVar.f900k);
                            childAt.setTranslationZ(lVar.f901l);
                            if (lVar.f902m) {
                                childAt.setElevation(lVar.f903n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            h hVar2 = (h) hashMap.get(num);
            if (hVar2 != null) {
                i iVar2 = hVar2.f801e;
                if (iVar2.f848i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = iVar2.f849j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = iVar2.f851k0;
                        if (str2 != null) {
                            int[] f8 = f(barrier2, str2);
                            iVar2.f849j0 = f8;
                            barrier2.setReferencedIds(f8);
                        }
                    }
                    barrier2.setType(iVar2.f844g0);
                    barrier2.setMargin(iVar2.f846h0);
                    s sVar = ConstraintLayout.f8998I;
                    c cVar2 = new c();
                    barrier2.q();
                    hVar2.a(cVar2);
                    constraintLayout.addView(barrier2, cVar2);
                }
                if (iVar2.f832a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    s sVar2 = ConstraintLayout.f8998I;
                    c cVar3 = new c();
                    hVar2.a(cVar3);
                    constraintLayout.addView(guideline, cVar3);
                }
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = constraintLayout.getChildAt(i8);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).g(constraintLayout);
            }
        }
    }

    public final void e(int i7, Context context) {
        m mVar = this;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(i7, (ViewGroup) null);
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = mVar.f912f;
        hashMap.clear();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = constraintLayout.getChildAt(i8);
            c cVar = (c) childAt.getLayoutParams();
            int id = childAt.getId();
            if (mVar.f911e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new h());
            }
            h hVar = (h) hashMap.get(Integer.valueOf(id));
            if (hVar != null) {
                HashMap hashMap2 = mVar.f910d;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    a aVar = (a) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e7) {
                        e7.printStackTrace();
                    } catch (NoSuchMethodException e8) {
                        e8.printStackTrace();
                    } catch (InvocationTargetException e9) {
                        e9.printStackTrace();
                    }
                }
                hVar.f803g = hashMap3;
                hVar.c(id, cVar);
                int visibility = childAt.getVisibility();
                k kVar = hVar.f799c;
                kVar.f886b = visibility;
                kVar.f888d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                l lVar = hVar.f802f;
                lVar.f892b = rotation;
                lVar.f893c = childAt.getRotationX();
                lVar.f894d = childAt.getRotationY();
                lVar.f895e = childAt.getScaleX();
                lVar.f896f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    lVar.f897g = pivotX;
                    lVar.f898h = pivotY;
                }
                lVar.j = childAt.getTranslationX();
                lVar.f900k = childAt.getTranslationY();
                lVar.f901l = childAt.getTranslationZ();
                if (lVar.f902m) {
                    lVar.f903n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    i iVar = hVar.f801e;
                    iVar.f859o0 = allowsGoneWidget;
                    iVar.f849j0 = barrier.getReferencedIds();
                    iVar.f844g0 = barrier.getType();
                    iVar.f846h0 = barrier.getMargin();
                }
            }
            i8++;
            mVar = this;
        }
    }

    public final h h(int i7) {
        HashMap hashMap = this.f912f;
        if (!hashMap.containsKey(Integer.valueOf(i7))) {
            hashMap.put(Integer.valueOf(i7), new h());
        }
        return (h) hashMap.get(Integer.valueOf(i7));
    }

    public final h i(int i7) {
        HashMap hashMap = this.f912f;
        if (hashMap.containsKey(Integer.valueOf(i7))) {
            return (h) hashMap.get(Integer.valueOf(i7));
        }
        return null;
    }

    public final void j(int i7, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    h g3 = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        g3.f801e.f832a = true;
                    }
                    this.f912f.put(Integer.valueOf(g3.f797a), g3);
                }
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cf, code lost:
    
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
    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            h hVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlResourceParser.getName()) {
                            case "Constraint":
                                hVar = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                break;
                            case "ConstraintOverride":
                                hVar = g(context, Xml.asAttributeSet(xmlResourceParser), true);
                                break;
                            case "Guideline":
                                hVar = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                i iVar = hVar.f801e;
                                iVar.f832a = true;
                                iVar.f834b = true;
                                break;
                            case "Barrier":
                                hVar = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                hVar.f801e.f848i0 = 1;
                                break;
                            case "PropertySet":
                                if (hVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                hVar.f799c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "Transform":
                                if (hVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                hVar.f802f.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "Layout":
                                if (hVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                hVar.f801e.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "Motion":
                                if (hVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                hVar.f800d.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "CustomAttribute":
                            case "CustomMethod":
                                if (hVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                a.d(context, xmlResourceParser, hVar.f803g);
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
                            this.f912f.put(Integer.valueOf(hVar.f797a), hVar);
                            hVar = null;
                        }
                    }
                } else {
                    xmlResourceParser.getName();
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }
}
