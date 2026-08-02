package p000;

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
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: cm */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0103cm {

    /* JADX INFO: renamed from: d */
    public static final int[] f1288d = {0, 4, 8};

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f1289e;

    /* JADX INFO: renamed from: f */
    public static final SparseIntArray f1290f;

    /* JADX INFO: renamed from: a */
    public final HashMap f1291a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final boolean f1292b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f1293c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1289e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f1290f = sparseIntArray2;
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

    /* JADX INFO: renamed from: b */
    public static int[] m967b(C0168eb c0168eb, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c0168eb.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = gz0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c0168eb.isInEditMode() && (c0168eb.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0168eb.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f478v;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f478v.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: c */
    public static C0881xl m968c(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        C0881xl c0881xl = new C0881xl();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? iz0.f3752c : iz0.f3750a);
        String[] strArr = d71.f1567a;
        C0023am c0023am = c0881xl.f8985b;
        C0067bm c0067bm = c0881xl.f8988e;
        C0955zl c0955zl = c0881xl.f8986c;
        C0918yl c0918yl = c0881xl.f8987d;
        int[] iArr = f1288d;
        SparseIntArray sparseIntArray = f1289e;
        if (z) {
            C0844wl c0844wl = new C0844wl();
            c0844wl.f8569a = new int[10];
            c0844wl.f8570b = new int[10];
            c0844wl.f8571c = 0;
            c0844wl.f8572d = new int[10];
            c0844wl.f8573e = new float[10];
            c0844wl.f8574f = 0;
            c0844wl.f8575g = new int[5];
            c0844wl.f8576h = new String[5];
            c0844wl.f8577i = 0;
            c0844wl.f8578j = new int[4];
            c0844wl.f8579k = new boolean[4];
            c0844wl.f8580l = 0;
            c0955zl.getClass();
            c0918yl.getClass();
            c0067bm.getClass();
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f1290f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        c0844wl.m5352b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9329I));
                        continue;
                        i3 = i4 + 1;
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
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        c0844wl.m5354d(typedArrayObtainStyledAttributes.getString(index), 5);
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 6:
                        i2 = indexCount;
                        c0844wl.m5352b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0918yl.f9323C));
                        break;
                    case 7:
                        i2 = indexCount;
                        c0844wl.m5352b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0918yl.f9324D));
                        break;
                    case 8:
                        i2 = indexCount;
                        c0844wl.m5352b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9330J));
                        break;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        i2 = indexCount;
                        c0844wl.m5352b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9336P));
                        break;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        i2 = indexCount;
                        c0844wl.m5352b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9337Q));
                        break;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        i2 = indexCount;
                        c0844wl.m5352b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9333M));
                        break;
                    case 14:
                        i2 = indexCount;
                        c0844wl.m5352b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9335O));
                        break;
                    case 15:
                        i2 = indexCount;
                        c0844wl.m5352b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9338R));
                        break;
                    case 16:
                        i2 = indexCount;
                        c0844wl.m5352b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9334N));
                        break;
                    case 17:
                        i2 = indexCount;
                        c0844wl.m5352b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0918yl.f9353d));
                        break;
                    case 18:
                        i2 = indexCount;
                        c0844wl.m5352b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0918yl.f9355e));
                        break;
                    case 19:
                        i2 = indexCount;
                        c0844wl.m5351a(19, typedArrayObtainStyledAttributes.getFloat(index, c0918yl.f9357f));
                        break;
                    case 20:
                        i2 = indexCount;
                        c0844wl.m5351a(20, typedArrayObtainStyledAttributes.getFloat(index, c0918yl.f9384w));
                        break;
                    case 21:
                        i2 = indexCount;
                        c0844wl.m5352b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c0918yl.f9351c));
                        break;
                    case 22:
                        i2 = indexCount;
                        c0844wl.m5352b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c0023am.f243a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        c0844wl.m5352b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c0918yl.f9349b));
                        break;
                    case 24:
                        i2 = indexCount;
                        c0844wl.m5352b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9326F));
                        break;
                    case 27:
                        i2 = indexCount;
                        c0844wl.m5352b(27, typedArrayObtainStyledAttributes.getInt(index, c0918yl.f9325E));
                        break;
                    case 28:
                        i2 = indexCount;
                        c0844wl.m5352b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9327G));
                        break;
                    case 31:
                        i2 = indexCount;
                        c0844wl.m5352b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9331K));
                        break;
                    case 34:
                        i2 = indexCount;
                        c0844wl.m5352b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9328H));
                        break;
                    case 37:
                        i2 = indexCount;
                        c0844wl.m5351a(37, typedArrayObtainStyledAttributes.getFloat(index, c0918yl.f9385x));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0881xl.f8984a);
                        c0881xl.f8984a = resourceId;
                        c0844wl.m5352b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        c0844wl.m5351a(39, typedArrayObtainStyledAttributes.getFloat(index, c0918yl.f9341U));
                        break;
                    case 40:
                        i2 = indexCount;
                        c0844wl.m5351a(40, typedArrayObtainStyledAttributes.getFloat(index, c0918yl.f9340T));
                        break;
                    case 41:
                        i2 = indexCount;
                        c0844wl.m5352b(41, typedArrayObtainStyledAttributes.getInt(index, c0918yl.f9342V));
                        break;
                    case 42:
                        i2 = indexCount;
                        c0844wl.m5352b(42, typedArrayObtainStyledAttributes.getInt(index, c0918yl.f9343W));
                        break;
                    case 43:
                        i2 = indexCount;
                        c0844wl.m5351a(43, typedArrayObtainStyledAttributes.getFloat(index, c0023am.f245c));
                        break;
                    case 44:
                        i2 = indexCount;
                        c0844wl.m5353c(44, true);
                        c0844wl.m5351a(44, typedArrayObtainStyledAttributes.getDimension(index, c0067bm.f917m));
                        break;
                    case 45:
                        i2 = indexCount;
                        c0844wl.m5351a(45, typedArrayObtainStyledAttributes.getFloat(index, c0067bm.f906b));
                        break;
                    case 46:
                        i2 = indexCount;
                        c0844wl.m5351a(46, typedArrayObtainStyledAttributes.getFloat(index, c0067bm.f907c));
                        break;
                    case 47:
                        i2 = indexCount;
                        c0844wl.m5351a(47, typedArrayObtainStyledAttributes.getFloat(index, c0067bm.f908d));
                        break;
                    case 48:
                        i2 = indexCount;
                        c0844wl.m5351a(48, typedArrayObtainStyledAttributes.getFloat(index, c0067bm.f909e));
                        break;
                    case 49:
                        i2 = indexCount;
                        c0844wl.m5351a(49, typedArrayObtainStyledAttributes.getDimension(index, c0067bm.f910f));
                        break;
                    case 50:
                        i2 = indexCount;
                        c0844wl.m5351a(50, typedArrayObtainStyledAttributes.getDimension(index, c0067bm.f911g));
                        break;
                    case 51:
                        i2 = indexCount;
                        c0844wl.m5351a(51, typedArrayObtainStyledAttributes.getDimension(index, c0067bm.f913i));
                        break;
                    case 52:
                        i2 = indexCount;
                        c0844wl.m5351a(52, typedArrayObtainStyledAttributes.getDimension(index, c0067bm.f914j));
                        break;
                    case 53:
                        i2 = indexCount;
                        c0844wl.m5351a(53, typedArrayObtainStyledAttributes.getDimension(index, c0067bm.f915k));
                        break;
                    case 54:
                        i2 = indexCount;
                        c0844wl.m5352b(54, typedArrayObtainStyledAttributes.getInt(index, c0918yl.f9344X));
                        break;
                    case 55:
                        i2 = indexCount;
                        c0844wl.m5352b(55, typedArrayObtainStyledAttributes.getInt(index, c0918yl.f9345Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        c0844wl.m5352b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9346Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        c0844wl.m5352b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9348a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        c0844wl.m5352b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9350b0));
                        break;
                    case 59:
                        i2 = indexCount;
                        c0844wl.m5352b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9352c0));
                        break;
                    case 60:
                        i2 = indexCount;
                        c0844wl.m5351a(60, typedArrayObtainStyledAttributes.getFloat(index, c0067bm.f905a));
                        break;
                    case 62:
                        i2 = indexCount;
                        c0844wl.m5352b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9321A));
                        break;
                    case 63:
                        i2 = indexCount;
                        c0844wl.m5351a(63, typedArrayObtainStyledAttributes.getFloat(index, c0918yl.f9322B));
                        break;
                    case 64:
                        i2 = indexCount;
                        c0844wl.m5352b(64, m969e(typedArrayObtainStyledAttributes, index, c0955zl.f9850a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c0844wl.m5354d(typedArrayObtainStyledAttributes.getString(index), 65);
                        } else {
                            c0844wl.m5354d(strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        c0844wl.m5352b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        c0844wl.m5351a(67, typedArrayObtainStyledAttributes.getFloat(index, c0955zl.f9854e));
                        break;
                    case 68:
                        i2 = indexCount;
                        c0844wl.m5351a(68, typedArrayObtainStyledAttributes.getFloat(index, c0023am.f246d));
                        break;
                    case 69:
                        i2 = indexCount;
                        c0844wl.m5351a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        c0844wl.m5351a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        c0844wl.m5352b(72, typedArrayObtainStyledAttributes.getInt(index, c0918yl.f9358f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        c0844wl.m5352b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9360g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        c0844wl.m5354d(typedArrayObtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i2 = indexCount;
                        c0844wl.m5353c(75, typedArrayObtainStyledAttributes.getBoolean(index, c0918yl.f9374n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        c0844wl.m5352b(76, typedArrayObtainStyledAttributes.getInt(index, c0955zl.f9852c));
                        break;
                    case 77:
                        i2 = indexCount;
                        c0844wl.m5354d(typedArrayObtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i2 = indexCount;
                        c0844wl.m5352b(78, typedArrayObtainStyledAttributes.getInt(index, c0023am.f244b));
                        break;
                    case 79:
                        i2 = indexCount;
                        c0844wl.m5351a(79, typedArrayObtainStyledAttributes.getFloat(index, c0955zl.f9853d));
                        break;
                    case 80:
                        i2 = indexCount;
                        c0844wl.m5353c(80, typedArrayObtainStyledAttributes.getBoolean(index, c0918yl.f9370l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        c0844wl.m5353c(81, typedArrayObtainStyledAttributes.getBoolean(index, c0918yl.f9372m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        c0844wl.m5352b(82, typedArrayObtainStyledAttributes.getInteger(index, c0955zl.f9851b));
                        break;
                    case 83:
                        i2 = indexCount;
                        c0844wl.m5352b(83, m969e(typedArrayObtainStyledAttributes, index, c0067bm.f912h));
                        break;
                    case 84:
                        i2 = indexCount;
                        c0844wl.m5352b(84, typedArrayObtainStyledAttributes.getInteger(index, c0955zl.f9856g));
                        break;
                    case 85:
                        i2 = indexCount;
                        c0844wl.m5351a(85, typedArrayObtainStyledAttributes.getFloat(index, c0955zl.f9855f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c0955zl.f9858i = resourceId2;
                            c0844wl.m5352b(89, resourceId2);
                            if (c0955zl.f9858i != -1) {
                                c0844wl.m5352b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c0955zl.f9857h = string;
                            c0844wl.m5354d(string, 90);
                            if (c0955zl.f9857h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c0955zl.f9858i = resourceId3;
                                c0844wl.m5352b(89, resourceId3);
                                c0844wl.m5352b(88, -2);
                            } else {
                                c0844wl.m5352b(88, -1);
                            }
                        } else {
                            c0844wl.m5352b(88, typedArrayObtainStyledAttributes.getInteger(index, c0955zl.f9858i));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        c0844wl.m5352b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9332L));
                        break;
                    case 94:
                        i2 = indexCount;
                        c0844wl.m5352b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0918yl.f9339S));
                        break;
                    case 95:
                        i2 = indexCount;
                        m970f(c0844wl, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        m970f(c0844wl, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        c0844wl.m5352b(97, typedArrayObtainStyledAttributes.getInt(index, c0918yl.f9376o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = pq0.f6233z;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c0881xl.f8984a = typedArrayObtainStyledAttributes.getResourceId(index, c0881xl.f8984a);
                        }
                        break;
                    case 99:
                        i2 = indexCount;
                        c0844wl.m5353c(99, typedArrayObtainStyledAttributes.getBoolean(index, c0918yl.f9359g));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        c0955zl.getClass();
                        c0918yl.getClass();
                        c0067bm.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        c0918yl.f9377p = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9377p);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        c0918yl.f9329I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9329I);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        c0918yl.f9375o = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9375o);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        c0918yl.f9373n = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9373n);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        c0918yl.f9386y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        c0918yl.f9323C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0918yl.f9323C);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        c0918yl.f9324D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0918yl.f9324D);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        c0918yl.f9330J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9330J);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        c0918yl.f9383v = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9383v);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        c0918yl.f9382u = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9382u);
                        continue;
                        i7++;
                        break;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        i = indexCount2;
                        c0918yl.f9336P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9336P);
                        continue;
                        i7++;
                        break;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        i = indexCount2;
                        c0918yl.f9337Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9337Q);
                        continue;
                        i7++;
                        break;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        i = indexCount2;
                        c0918yl.f9333M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9333M);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        c0918yl.f9335O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9335O);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        c0918yl.f9338R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9338R);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        c0918yl.f9334N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9334N);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        c0918yl.f9353d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0918yl.f9353d);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        c0918yl.f9355e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0918yl.f9355e);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        c0918yl.f9357f = typedArrayObtainStyledAttributes.getFloat(index2, c0918yl.f9357f);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        c0918yl.f9384w = typedArrayObtainStyledAttributes.getFloat(index2, c0918yl.f9384w);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        c0918yl.f9351c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c0918yl.f9351c);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, c0023am.f243a);
                        c0023am.f243a = i8;
                        c0023am.f243a = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        c0918yl.f9349b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c0918yl.f9349b);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        c0918yl.f9326F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9326F);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        c0918yl.f9361h = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9361h);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        c0918yl.f9363i = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9363i);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        c0918yl.f9325E = typedArrayObtainStyledAttributes.getInt(index2, c0918yl.f9325E);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        c0918yl.f9327G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9327G);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        c0918yl.f9365j = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9365j);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        c0918yl.f9367k = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9367k);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        c0918yl.f9331K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9331K);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        c0918yl.f9380s = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9380s);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        c0918yl.f9381t = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9381t);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        c0918yl.f9328H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9328H);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        c0918yl.f9371m = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9371m);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        c0918yl.f9369l = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9369l);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        c0918yl.f9385x = typedArrayObtainStyledAttributes.getFloat(index2, c0918yl.f9385x);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        c0881xl.f8984a = typedArrayObtainStyledAttributes.getResourceId(index2, c0881xl.f8984a);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        c0918yl.f9341U = typedArrayObtainStyledAttributes.getFloat(index2, c0918yl.f9341U);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        c0918yl.f9340T = typedArrayObtainStyledAttributes.getFloat(index2, c0918yl.f9340T);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        c0918yl.f9342V = typedArrayObtainStyledAttributes.getInt(index2, c0918yl.f9342V);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        c0918yl.f9343W = typedArrayObtainStyledAttributes.getInt(index2, c0918yl.f9343W);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        c0023am.f245c = typedArrayObtainStyledAttributes.getFloat(index2, c0023am.f245c);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        c0067bm.f916l = true;
                        c0067bm.f917m = typedArrayObtainStyledAttributes.getDimension(index2, c0067bm.f917m);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        c0067bm.f906b = typedArrayObtainStyledAttributes.getFloat(index2, c0067bm.f906b);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        c0067bm.f907c = typedArrayObtainStyledAttributes.getFloat(index2, c0067bm.f907c);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        c0067bm.f908d = typedArrayObtainStyledAttributes.getFloat(index2, c0067bm.f908d);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        c0067bm.f909e = typedArrayObtainStyledAttributes.getFloat(index2, c0067bm.f909e);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        c0067bm.f910f = typedArrayObtainStyledAttributes.getDimension(index2, c0067bm.f910f);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        c0067bm.f911g = typedArrayObtainStyledAttributes.getDimension(index2, c0067bm.f911g);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        c0067bm.f913i = typedArrayObtainStyledAttributes.getDimension(index2, c0067bm.f913i);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        c0067bm.f914j = typedArrayObtainStyledAttributes.getDimension(index2, c0067bm.f914j);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        c0067bm.f915k = typedArrayObtainStyledAttributes.getDimension(index2, c0067bm.f915k);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        c0918yl.f9344X = typedArrayObtainStyledAttributes.getInt(index2, c0918yl.f9344X);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        c0918yl.f9345Y = typedArrayObtainStyledAttributes.getInt(index2, c0918yl.f9345Y);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        c0918yl.f9346Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9346Z);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        c0918yl.f9348a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9348a0);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        c0918yl.f9350b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9350b0);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        c0918yl.f9352c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9352c0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        c0067bm.f905a = typedArrayObtainStyledAttributes.getFloat(index2, c0067bm.f905a);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        c0918yl.f9387z = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9387z);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        c0918yl.f9321A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9321A);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        c0918yl.f9322B = typedArrayObtainStyledAttributes.getFloat(index2, c0918yl.f9322B);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        c0955zl.f9850a = m969e(typedArrayObtainStyledAttributes, index2, c0955zl.f9850a);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c0955zl.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c0955zl.getClass();
                        }
                        i7++;
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c0955zl.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        c0955zl.f9854e = typedArrayObtainStyledAttributes.getFloat(index2, c0955zl.f9854e);
                        break;
                    case 68:
                        i = indexCount2;
                        c0023am.f246d = typedArrayObtainStyledAttributes.getFloat(index2, c0023am.f246d);
                        break;
                    case 69:
                        i = indexCount2;
                        c0918yl.f9354d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        c0918yl.f9356e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        c0918yl.f9358f0 = typedArrayObtainStyledAttributes.getInt(index2, c0918yl.f9358f0);
                        break;
                    case 73:
                        i = indexCount2;
                        c0918yl.f9360g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9360g0);
                        break;
                    case 74:
                        i = indexCount2;
                        c0918yl.f9366j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        c0918yl.f9374n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0918yl.f9374n0);
                        break;
                    case 76:
                        i = indexCount2;
                        c0955zl.f9852c = typedArrayObtainStyledAttributes.getInt(index2, c0955zl.f9852c);
                        break;
                    case 77:
                        i = indexCount2;
                        c0918yl.f9368k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        c0023am.f244b = typedArrayObtainStyledAttributes.getInt(index2, c0023am.f244b);
                        break;
                    case 79:
                        i = indexCount2;
                        c0955zl.f9853d = typedArrayObtainStyledAttributes.getFloat(index2, c0955zl.f9853d);
                        break;
                    case 80:
                        i = indexCount2;
                        c0918yl.f9370l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0918yl.f9370l0);
                        break;
                    case 81:
                        i = indexCount2;
                        c0918yl.f9372m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0918yl.f9372m0);
                        break;
                    case 82:
                        i = indexCount2;
                        c0955zl.f9851b = typedArrayObtainStyledAttributes.getInteger(index2, c0955zl.f9851b);
                        break;
                    case 83:
                        i = indexCount2;
                        c0067bm.f912h = m969e(typedArrayObtainStyledAttributes, index2, c0067bm.f912h);
                        break;
                    case 84:
                        i = indexCount2;
                        c0955zl.f9856g = typedArrayObtainStyledAttributes.getInteger(index2, c0955zl.f9856g);
                        break;
                    case 85:
                        i = indexCount2;
                        c0955zl.f9855f = typedArrayObtainStyledAttributes.getFloat(index2, c0955zl.f9855f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            c0955zl.f9858i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c0955zl.f9857h = string2;
                            if (string2.indexOf("/") > 0) {
                                c0955zl.f9858i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c0955zl.f9858i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        c0918yl.f9378q = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9378q);
                        break;
                    case 92:
                        i = indexCount2;
                        c0918yl.f9379r = m969e(typedArrayObtainStyledAttributes, index2, c0918yl.f9379r);
                        break;
                    case 93:
                        i = indexCount2;
                        c0918yl.f9332L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9332L);
                        break;
                    case 94:
                        i = indexCount2;
                        c0918yl.f9339S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0918yl.f9339S);
                        break;
                    case 95:
                        i = indexCount2;
                        m970f(c0918yl, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        m970f(c0918yl, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        c0918yl.f9376o0 = typedArrayObtainStyledAttributes.getInt(index2, c0918yl.f9376o0);
                        break;
                }
                i7++;
            }
            if (c0918yl.f9366j0 != null) {
                c0918yl.f9364i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c0881xl;
    }

    /* JADX INFO: renamed from: e */
    public static int m969e(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX INFO: renamed from: f */
    public static void m970f(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        C0844wl c0844wl;
        C0918yl c0918yl;
        C0733tl c0733tl;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof C0733tl) {
                    c0733tl = (C0733tl) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) c0733tl).width = i4;
                        c0733tl.f7483W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0733tl).height = i4;
                        c0733tl.f7484X = z;
                        return;
                    }
                }
                if (obj instanceof C0918yl) {
                    c0918yl = (C0918yl) obj;
                    if (i2 == 0) {
                        c0918yl.f9349b = i4;
                        c0918yl.f9370l0 = z;
                        return;
                    } else {
                        c0918yl.f9351c = i4;
                        c0918yl.f9372m0 = z;
                        return;
                    }
                }
                if (obj instanceof C0844wl) {
                    c0844wl = (C0844wl) obj;
                    if (i2 == 0) {
                        c0844wl.m5352b(23, i4);
                        c0844wl.m5353c(80, z);
                        return;
                    } else {
                        c0844wl.m5352b(21, i4);
                        c0844wl.m5353c(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof C0733tl) {
                c0733tl = (C0733tl) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0733tl).width = i4;
                    c0733tl.f7483W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0733tl).height = i4;
                    c0733tl.f7484X = z;
                    return;
                }
            }
            if (obj instanceof C0918yl) {
                c0918yl = (C0918yl) obj;
                if (i2 == 0) {
                    c0918yl.f9349b = i4;
                    c0918yl.f9370l0 = z;
                    return;
                } else {
                    c0918yl.f9351c = i4;
                    c0918yl.f9372m0 = z;
                    return;
                }
            }
            if (obj instanceof C0844wl) {
                c0844wl = (C0844wl) obj;
                if (i2 == 0) {
                    c0844wl.m5352b(23, i4);
                    c0844wl.m5353c(80, z);
                    return;
                } else {
                    c0844wl.m5352b(21, i4);
                    c0844wl.m5353c(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof C0733tl) {
                    C0733tl c0733tl2 = (C0733tl) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) c0733tl2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0733tl2).height = 0;
                    }
                    m971g(c0733tl2, strTrim2);
                    return;
                }
                if (obj instanceof C0918yl) {
                    ((C0918yl) obj).f9386y = strTrim2;
                    return;
                } else {
                    if (obj instanceof C0844wl) {
                        ((C0844wl) obj).m5354d(strTrim2, 5);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof C0733tl) {
                        C0733tl c0733tl3 = (C0733tl) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0733tl3).width = 0;
                            c0733tl3.f7468H = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0733tl3).height = 0;
                            c0733tl3.f7469I = f;
                            return;
                        }
                    }
                    if (obj instanceof C0918yl) {
                        C0918yl c0918yl2 = (C0918yl) obj;
                        if (i2 == 0) {
                            c0918yl2.f9349b = 0;
                            c0918yl2.f9341U = f;
                            return;
                        } else {
                            c0918yl2.f9351c = 0;
                            c0918yl2.f9340T = f;
                            return;
                        }
                    }
                    if (obj instanceof C0844wl) {
                        C0844wl c0844wl2 = (C0844wl) obj;
                        if (i2 == 0) {
                            c0844wl2.m5352b(23, 0);
                            c0844wl2.m5351a(39, f);
                            return;
                        } else {
                            c0844wl2.m5352b(21, 0);
                            c0844wl2.m5351a(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof C0733tl) {
                        C0733tl c0733tl4 = (C0733tl) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0733tl4).width = 0;
                            c0733tl4.f7478R = fMax;
                            c0733tl4.f7472L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0733tl4).height = 0;
                            c0733tl4.f7479S = fMax;
                            c0733tl4.f7473M = 2;
                            return;
                        }
                    }
                    if (obj instanceof C0918yl) {
                        C0918yl c0918yl3 = (C0918yl) obj;
                        if (i2 == 0) {
                            c0918yl3.f9349b = 0;
                            c0918yl3.f9354d0 = fMax;
                            c0918yl3.f9344X = 2;
                            return;
                        } else {
                            c0918yl3.f9351c = 0;
                            c0918yl3.f9356e0 = fMax;
                            c0918yl3.f9345Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof C0844wl) {
                        C0844wl c0844wl3 = (C0844wl) obj;
                        if (i2 == 0) {
                            c0844wl3.m5352b(23, 0);
                            c0844wl3.m5352b(54, 2);
                        } else {
                            c0844wl3.m5352b(21, 0);
                            c0844wl3.m5352b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m971g(C0733tl c0733tl, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0733tl.f7467G = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m972a(Context context, int i) {
        ConstraintLayout constraintLayout;
        int i2;
        HashMap map;
        int i3;
        int i4;
        C0103cm c0103cm = this;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout2.getChildCount();
        HashMap map2 = c0103cm.f1293c;
        map2.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout2.getChildAt(i5);
            C0733tl c0733tl = (C0733tl) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0103cm.f1292b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new C0881xl());
            }
            C0881xl c0881xl = (C0881xl) map2.get(Integer.valueOf(id));
            if (c0881xl == null) {
                constraintLayout = constraintLayout2;
                i2 = childCount;
                map = map2;
                i3 = i5;
            } else {
                C0023am c0023am = c0881xl.f8985b;
                C0918yl c0918yl = c0881xl.f8987d;
                C0067bm c0067bm = c0881xl.f8988e;
                constraintLayout = constraintLayout2;
                HashMap map3 = new HashMap();
                i2 = childCount;
                Class<?> cls = childAt.getClass();
                map = map2;
                HashMap map4 = c0103cm.f1291a;
                for (String str : map4.keySet()) {
                    C0622ql c0622ql = (C0622ql) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i4 = i5;
                            try {
                                map3.put(str, new C0622ql(c0622ql, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            }
                        } else {
                            i4 = i5;
                            map3.put(str, new C0622ql(c0622ql, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        i4 = i5;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        i4 = i5;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        i4 = i5;
                    }
                    map4 = map5;
                    i5 = i4;
                }
                i3 = i5;
                c0881xl.f8989f = map3;
                c0881xl.f8984a = id;
                c0918yl.f9361h = c0733tl.f7495e;
                c0918yl.f9363i = c0733tl.f7497f;
                c0918yl.f9365j = c0733tl.f7499g;
                c0918yl.f9367k = c0733tl.f7501h;
                c0918yl.f9369l = c0733tl.f7503i;
                c0918yl.f9371m = c0733tl.f7505j;
                c0918yl.f9373n = c0733tl.f7507k;
                c0918yl.f9375o = c0733tl.f7509l;
                c0918yl.f9377p = c0733tl.f7511m;
                c0918yl.f9378q = c0733tl.f7513n;
                c0918yl.f9379r = c0733tl.f7515o;
                c0918yl.f9380s = c0733tl.f7521s;
                c0918yl.f9381t = c0733tl.f7522t;
                c0918yl.f9382u = c0733tl.f7523u;
                c0918yl.f9383v = c0733tl.f7524v;
                c0918yl.f9384w = c0733tl.f7465E;
                c0918yl.f9385x = c0733tl.f7466F;
                c0918yl.f9386y = c0733tl.f7467G;
                c0918yl.f9387z = c0733tl.f7517p;
                c0918yl.f9321A = c0733tl.f7519q;
                c0918yl.f9322B = c0733tl.f7520r;
                c0918yl.f9323C = c0733tl.f7480T;
                c0918yl.f9324D = c0733tl.f7481U;
                c0918yl.f9325E = c0733tl.f7482V;
                c0918yl.f9357f = c0733tl.f7491c;
                c0918yl.f9353d = c0733tl.f7487a;
                c0918yl.f9355e = c0733tl.f7489b;
                c0918yl.f9349b = ((ViewGroup.MarginLayoutParams) c0733tl).width;
                c0918yl.f9351c = ((ViewGroup.MarginLayoutParams) c0733tl).height;
                c0918yl.f9326F = ((ViewGroup.MarginLayoutParams) c0733tl).leftMargin;
                c0918yl.f9327G = ((ViewGroup.MarginLayoutParams) c0733tl).rightMargin;
                c0918yl.f9328H = ((ViewGroup.MarginLayoutParams) c0733tl).topMargin;
                c0918yl.f9329I = ((ViewGroup.MarginLayoutParams) c0733tl).bottomMargin;
                c0918yl.f9332L = c0733tl.f7464D;
                c0918yl.f9340T = c0733tl.f7469I;
                c0918yl.f9341U = c0733tl.f7468H;
                c0918yl.f9343W = c0733tl.f7471K;
                c0918yl.f9342V = c0733tl.f7470J;
                c0918yl.f9370l0 = c0733tl.f7483W;
                c0918yl.f9372m0 = c0733tl.f7484X;
                c0918yl.f9344X = c0733tl.f7472L;
                c0918yl.f9345Y = c0733tl.f7473M;
                c0918yl.f9346Z = c0733tl.f7476P;
                c0918yl.f9348a0 = c0733tl.f7477Q;
                c0918yl.f9350b0 = c0733tl.f7474N;
                c0918yl.f9352c0 = c0733tl.f7475O;
                c0918yl.f9354d0 = c0733tl.f7478R;
                c0918yl.f9356e0 = c0733tl.f7479S;
                c0918yl.f9368k0 = c0733tl.f7485Y;
                c0918yl.f9334N = c0733tl.f7526x;
                c0918yl.f9336P = c0733tl.f7528z;
                c0918yl.f9333M = c0733tl.f7525w;
                c0918yl.f9335O = c0733tl.f7527y;
                c0918yl.f9338R = c0733tl.f7461A;
                c0918yl.f9337Q = c0733tl.f7462B;
                c0918yl.f9339S = c0733tl.f7463C;
                c0918yl.f9376o0 = c0733tl.f7486Z;
                c0918yl.f9330J = c0733tl.getMarginEnd();
                c0918yl.f9331K = c0733tl.getMarginStart();
                c0023am.f243a = childAt.getVisibility();
                c0023am.f245c = childAt.getAlpha();
                c0067bm.f905a = childAt.getRotation();
                c0067bm.f906b = childAt.getRotationX();
                c0067bm.f907c = childAt.getRotationY();
                c0067bm.f908d = childAt.getScaleX();
                c0067bm.f909e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c0067bm.f910f = pivotX;
                    c0067bm.f911g = pivotY;
                }
                c0067bm.f913i = childAt.getTranslationX();
                c0067bm.f914j = childAt.getTranslationY();
                c0067bm.f915k = childAt.getTranslationZ();
                if (c0067bm.f916l) {
                    c0067bm.f917m = childAt.getElevation();
                }
                if (childAt instanceof C0168eb) {
                    C0168eb c0168eb = (C0168eb) childAt;
                    c0918yl.f9374n0 = c0168eb.getAllowsGoneWidget();
                    c0918yl.f9364i0 = c0168eb.getReferencedIds();
                    c0918yl.f9358f0 = c0168eb.getType();
                    c0918yl.f9360g0 = c0168eb.getMargin();
                }
            }
            i5 = i3 + 1;
            c0103cm = this;
            constraintLayout2 = constraintLayout;
            childCount = i2;
            map2 = map;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m973d(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C0881xl c0881xlM968c = m968c(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0881xlM968c.f8987d.f9347a = true;
                    }
                    this.f1293c.put(Integer.valueOf(c0881xlM968c.f8984a), c0881xlM968c);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }
}
