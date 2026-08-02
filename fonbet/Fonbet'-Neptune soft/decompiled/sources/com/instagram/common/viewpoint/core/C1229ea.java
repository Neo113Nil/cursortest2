package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ea, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1229ea implements InterfaceC0729Rj {
    public static byte[] A03;
    public static String[] A04 = {"1hpByTARN6eOnQ", "46DvCO0dFj9d90pc7Bl3Va1pW3afVu0G", "LtfSHnVMNf9jD1VPw2QJdb6akNXb3KRw", "UXeRQ2HNaneiXsHAoGvRBzblNiVPPyfq", "WcHPi3i27m6LdaHLnkH9ENRpFxyJu3g8", "FTcDokCppzFM6olvGfJVNXVubstDZ8VZ", "v3Z7C81p3UBYKX6nY0MAEeka3DNz7RKw", "vwYfKziuTy1RLYscQHjTEDI4uYjWuvBq"};
    public final InterfaceC1257f2 A01;
    public Set<InterfaceC0732Rm> A00 = new HashSet();
    public final List<InterfaceC0731Rl> A02 = new ArrayList();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{75, 75, 78, Ascii.CAN, 81, 75, 78, Ascii.CAN, 39, 53, 53, 35, 50, 53};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public synchronized void A03() {
        if (!this.A01.AAV()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC0732Rm> A01 = A01(this.A01.A7a());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            Iterator<InterfaceC0731Rl> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A4B();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC0732Rm interfaceC0732Rm : this.A00) {
                String.format(Locale.US, A00(0, 8, 58), interfaceC0732Rm.A9G(), interfaceC0732Rm.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C1229ea(InterfaceC0323Bn interfaceC0323Bn) {
        this.A01 = interfaceC0323Bn.A5M(EnumC1258f3.A0B);
        this.A01.A3t(new C1276fM(this));
        A03();
    }

    public static Set<InterfaceC0732Rm> A01(JSONObject jSONObject) {
        C1222eT A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 23));
        if (optJSONArray == null) {
            return null;
        }
        int i = 0;
        while (true) {
            int i2 = optJSONArray.length();
            if (A04[2].charAt(7) != 'M') {
                throw new RuntimeException();
            }
            A04[0] = "HjevAVNXdTQxpc55Yqf8Zim5Y";
            if (i < i2) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null || (A00 = C1222eT.A00(optJSONObject)) == null) {
                    return null;
                }
                hashSet.add(A00);
                i++;
            } else {
                return hashSet;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0729Rj
    public final void A3s(InterfaceC0731Rl interfaceC0731Rl) {
        this.A02.add(interfaceC0731Rl);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0729Rj
    public final synchronized Set<InterfaceC0732Rm> A6p() {
        return new HashSet(this.A00);
    }
}
