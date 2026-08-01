package com.mbridge.msdk.config.dynamic.baseview.touch;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import bolts.MeasurementEvent;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: TouchEventData.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private float f9100a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private long g;
    private long h;
    private float i;
    private float j;
    private float k;
    private int l;
    private int m;
    private int n;
    private View o;
    private final List<C1362a> p = new ArrayList();
    private int q = 0;

    /* compiled from: TouchEventData.java */
    /* renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a$a, reason: collision with other inner class name */
    public static class C1362a {

        /* renamed from: a, reason: collision with root package name */
        public final int f9101a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final int g;

        public C1362a(int i, float f, float f2, float f3, float f4, float f5, int i2) {
            this.f9101a = i;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = f5;
            this.g = i2;
        }
    }

    private float a(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawX(motionEvent.getActionIndex()) : motionEvent.getRawX();
    }

    private float b(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawY(motionEvent.getActionIndex()) : motionEvent.getRawY();
    }

    private void g(MotionEvent motionEvent) {
        this.p.clear();
        if (Build.VERSION.SDK_INT < 29) {
            this.q = 1;
            this.p.add(new C1362a(motionEvent.getPointerId(0), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getOrientation(), motionEvent.getToolType(motionEvent.getActionIndex())));
        } else {
            this.q = motionEvent.getPointerCount();
            for (int i = 0; i < this.q; i++) {
                this.p.add(new C1362a(motionEvent.getPointerId(i), motionEvent.getRawX(i), motionEvent.getRawY(i), motionEvent.getPressure(i), motionEvent.getSize(i), motionEvent.getOrientation(i), motionEvent.getToolType(i)));
            }
        }
    }

    private void h(MotionEvent motionEvent) {
        this.i = motionEvent.getPressure();
        this.j = motionEvent.getSize();
        this.k = motionEvent.getOrientation();
        this.l = motionEvent.getToolType(motionEvent.getActionIndex());
    }

    public void c(MotionEvent motionEvent) {
        g(motionEvent);
    }

    public void d(MotionEvent motionEvent) {
        this.f9100a = a(motionEvent);
        this.b = b(motionEvent);
        this.g = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void e(MotionEvent motionEvent) {
        this.c = a(motionEvent);
        this.d = b(motionEvent);
        h(motionEvent);
        g(motionEvent);
    }

    public void f(MotionEvent motionEvent) {
        this.e = a(motionEvent);
        this.f = b(motionEvent);
        this.h = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void c(View view) {
        this.o = view;
        this.m = view.getWidth();
        this.n = view.getHeight();
    }

    private void b(HashMap<String, Object> hashMap) {
        ArrayList arrayList = new ArrayList();
        for (C1362a c1362a : this.p) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("x", String.valueOf(c1362a.b));
            hashMap2.put("y", String.valueOf(c1362a.c));
            hashMap2.put("pressure", String.valueOf(c1362a.d));
            hashMap2.put(ContentDisposition.Parameters.Size, String.valueOf(c1362a.e));
            hashMap2.put("id", Integer.valueOf(c1362a.f9101a));
            arrayList.add(hashMap2);
        }
        hashMap.put("points", arrayList);
    }

    private void c(HashMap<String, Object> hashMap) {
        hashMap.put("down_x", Float.valueOf(this.f9100a));
        hashMap.put("down_y", Float.valueOf(this.b));
        hashMap.put("down_time", Long.valueOf(this.g));
        hashMap.put("up_x", Float.valueOf(this.e));
        hashMap.put("up_y", Float.valueOf(this.f));
        hashMap.put("up_time", Long.valueOf(this.h));
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        a(hashMap);
        b(hashMap);
        d(hashMap);
        c(hashMap);
        return hashMap;
    }

    private void d(HashMap<String, Object> hashMap) {
        View view = this.o;
        if (view != null) {
            hashMap.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME, view.getClass().getSimpleName());
            String b = b(this.o);
            hashMap.put("resource_id", b);
            String a2 = a(this.o);
            hashMap.put("content_desc", a2);
            hashMap.put("view_format", String.format("%s#%s(%s)", this.o.getClass().getSimpleName(), b, a2));
        }
    }

    public void c() {
        this.f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.f9100a = 0.0f;
        this.h = 0L;
        this.g = 0L;
        this.k = 0.0f;
        this.j = 0.0f;
        this.i = 0.0f;
        this.l = 0;
        this.n = 0;
        this.m = 0;
        this.o = null;
        this.q = 0;
        this.p.clear();
    }

    private void a(HashMap<String, Object> hashMap) {
        hashMap.put(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, "touch");
        hashMap.put("event_time", String.valueOf(System.currentTimeMillis()));
        hashMap.put("down_time", String.valueOf(this.g));
    }

    private String b(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Exception unused) {
                return String.valueOf(view.getId());
            }
        }
        return "";
    }

    private String a(View view) {
        CharSequence contentDescription = view.getContentDescription();
        return contentDescription != null ? contentDescription.toString() : "";
    }

    public C1362a b() {
        if (this.p.isEmpty()) {
            return null;
        }
        return this.p.get(0);
    }
}
