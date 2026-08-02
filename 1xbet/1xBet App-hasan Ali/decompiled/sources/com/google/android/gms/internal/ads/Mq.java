package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Mq {

    /* renamed from: a, reason: collision with root package name */
    public final int f10723a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10724b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10725c;

    public Mq(int i, int i5, boolean z3) {
        this.f10723a = i;
        this.f10724b = i5;
        this.f10725c = z3;
    }

    public static ArrayList a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i5 = 0;
            boolean z3 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i5 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z3 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new Mq(i, i5, z3));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
