package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeParser;
import com.startapp.sdk.internal.pi;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class WeightedChoice implements Serializable {
    private static final long serialVersionUID = 8011948312180032586L;
    private final String[] keys;
    private final int[] weights;

    public static class Parser implements TypeParser<WeightedChoice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.startapp.json.TypeParser
        public WeightedChoice parse(Class<WeightedChoice> cls, Object obj) {
            if (obj instanceof String) {
                return new WeightedChoice(new String[]{(String) obj}, new int[]{1});
            }
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            int length = jSONObject.length();
            String[] strArr = new String[length];
            int[] iArr = new int[length];
            Iterator<String> keys = jSONObject.keys();
            int i3 = 0;
            while (keys.hasNext()) {
                String next = keys.next();
                strArr[i3] = next;
                iArr[i3] = jSONObject.optInt(next, 0);
                i3++;
            }
            return new WeightedChoice(strArr, iArr);
        }
    }

    public WeightedChoice(String[] strArr, int[] iArr) {
        this.keys = strArr;
        this.weights = iArr;
    }

    public final String a() {
        int[] iArr = this.weights;
        WeakHashMap weakHashMap = si.f4343a;
        int length = iArr.length;
        pi piVar = si.f4347e;
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int i3 = 0;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            if (i6 > 0) {
                i3 += i6;
                i4++;
                iArr2[i4] = i3 - 1;
                iArr3[i4] = i5;
            }
        }
        for (int i7 = i4 + 1; i7 < length; i7++) {
            iArr2[i7] = ((i3 + i7) - i4) - 1;
            iArr3[i7] = -1;
        }
        piVar.getClass();
        int binarySearch = Arrays.binarySearch(iArr2, ((Random) si.f4346d.a()).nextInt(i3));
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        }
        int i8 = iArr3[binarySearch];
        if (i8 < 0) {
            return null;
        }
        String[] strArr = this.keys;
        if (i8 < strArr.length) {
            return strArr[i8];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WeightedChoice weightedChoice = (WeightedChoice) obj;
            if (Arrays.equals(this.keys, weightedChoice.keys) && Arrays.equals(this.weights, weightedChoice.weights)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.keys, this.weights};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }
}
