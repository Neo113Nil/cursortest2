package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class OO {
    public static OO A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<ON>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<ON>> A03 = new HashMap<>();
    public final ArrayList<OM> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{Ascii.VT, Ascii.VT, 109, 66, 71, 95, 78, 89, Ascii.VT, 79, 66, 79, Ascii.VT, 69, 68, 95, Ascii.VT, 70, 74, 95, 72, 67, 17, Ascii.VT, 95, 95, 57, Ascii.SYN, 19, Ascii.VT, Ascii.SUB, Ascii.CR, 95, Ascii.DC2, Ascii.RS, Ascii.VT, Ascii.FS, Ascii.ETB, Ascii.SUB, Ascii.ESC, 94, 95, 95, Ascii.DC2, Ascii.RS, Ascii.VT, Ascii.FS, Ascii.ETB, 66, 79, 7, 42, 101, 108, 42, 99, 100, 126, 111, 100, 126, 42, 37, 118, 102, 109, 96, 104, 96, 37, 86, 116, 99, 126, 120, 121, 55, 123, 126, 100, 99, 45, 55, 84, 119, 123, 121, 116, 90, 106, 119, 121, 124, 123, 121, 107, 108, 85, 121, 118, 121, Byte.MAX_VALUE, 125, 106, Ascii.CAN, 52, 33, 54, Base64.padSymbol, 60, 59, 50, 117, 52, 50, 52, 60, 59, 38, 33, 117, 51, 60, 57, 33, 48, 39, 117, Ascii.CAN, 47, 57, 37, 38, 60, 35, 36, 45, 106, 62, 51, 58, 47, 106, 56, 58, 45, 48, 54, 55, 78, 76, 89, 72, 74, 66, 95, 84, Ascii.FF, 9, Ascii.FS, 9, 72, 69, 76, 89, 91, 64, 69, 64, 65, 89, 64, Ascii.SO, 92, 75, 79, 93, 65, 64};
    }

    static {
        A03();
        A07 = new Object();
    }

    public OO(Context context) {
        this.A00 = context;
        this.A01 = new OL(this, context.getMainLooper());
    }

    public static OO A00(Context context) {
        OO oo;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new OO(context.getApplicationContext());
            }
            oo = A05;
        }
        return oo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:10:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A02() {
        OM[] omArr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    omArr = new OM[size];
                    this.A02.toArray(omArr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (OM om : omArr) {
                int j = om.A01.size();
                for (int nbr = 0; nbr < j; nbr++) {
                    ON on = om.A01.get(nbr);
                    if (!on.A01) {
                        on.A02.onReceive(this.A00, om.A00);
                    }
                }
            }
        }
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<ON> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                ON on = remove.get(size);
                on.A01 = true;
                for (int j = 0; j < on.A03.countActions(); j++) {
                    String action = on.A03.getAction(j);
                    ArrayList<ON> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i = arrayList.size();
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            ON on2 = arrayList.get(i2);
                            if (on2.A02 == broadcastReceiver) {
                                on2.A01 = true;
                                arrayList.remove(i2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            ON on = new ON(intentFilter, broadcastReceiver);
            ArrayList<ON> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(on);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<ON> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(on);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String A01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String action2 = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                StringBuilder sb = new StringBuilder();
                String type = A01(128, 15, 117);
                StringBuilder append = sb.append(type).append(resolveTypeIfNeeded);
                String type2 = A01(62, 8, 58);
                StringBuilder append2 = append.append(type2).append(action2);
                String type3 = A01(51, 11, 53);
                append2.append(type3).append(intent).toString();
            }
            HashMap<String, ArrayList<ON>> hashMap = this.A03;
            String type4 = intent.getAction();
            ArrayList<ON> arrayList = hashMap.get(type4);
            if (arrayList != null) {
                if (debug) {
                    StringBuilder sb2 = new StringBuilder();
                    String type5 = A01(70, 13, 40);
                    sb2.append(type5).append(arrayList).toString();
                }
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    ON on = arrayList.get(i);
                    if (debug) {
                        StringBuilder sb3 = new StringBuilder();
                        String type6 = A01(104, 24, 106);
                        sb3.append(type6).append(on.A03).toString();
                    }
                    if (!on.A00) {
                        int match = on.A03.match(action, resolveTypeIfNeeded, action2, data, categories, A01(83, 21, 39));
                        if (match >= 0) {
                            if (debug) {
                                String str = A01(24, 27, 64) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(on);
                            on.A00 = true;
                        } else if (debug) {
                            switch (match) {
                                case -4:
                                    A01 = A01(Opcodes.FCMPL, 8, 18);
                                    break;
                                case -3:
                                    A01 = A01(Opcodes.D2L, 6, 102);
                                    break;
                                case -2:
                                    A01 = A01(157, 4, 87);
                                    break;
                                case -1:
                                    A01 = A01(Opcodes.IF_ICMPLT, 4, 3);
                                    break;
                                default:
                                    A01 = A01(Opcodes.IF_ACMPEQ, 14, 17);
                                    break;
                            }
                            String str2 = A01(0, 24, 20) + A01;
                        }
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((ON) arrayList2.get(i2)).A00 = false;
                    }
                    this.A02.add(new OM(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
