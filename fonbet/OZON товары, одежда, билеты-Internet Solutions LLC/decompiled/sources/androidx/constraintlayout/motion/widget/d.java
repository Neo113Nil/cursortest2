package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    static HashMap<String, Constructor<? extends a>> f41354b;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<Integer, ArrayList<a>> f41355a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends a>> hashMap = new HashMap<>();
        f41354b = hashMap;
        try {
            hashMap.put("KeyAttribute", b.class.getConstructor(new Class[0]));
            hashMap.put("KeyPosition", e.class.getConstructor(new Class[0]));
            hashMap.put("KeyCycle", c.class.getConstructor(new Class[0]));
            hashMap.put("KeyTimeCycle", g.class.getConstructor(new Class[0]));
            hashMap.put("KeyTrigger", h.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e11) {
            Log.e("KeyFrames", "unable to load", e11);
        }
    }

    public d() {
    }

    public final void a(k kVar) {
        ArrayList<a> arrayList = this.f41355a.get(-1);
        if (arrayList != null) {
            kVar.b(arrayList);
        }
    }

    public final void b(k kVar) {
        Integer valueOf = Integer.valueOf(kVar.f41434c);
        HashMap<Integer, ArrayList<a>> hashMap = this.f41355a;
        ArrayList<a> arrayList = hashMap.get(valueOf);
        if (arrayList != null) {
            kVar.b(arrayList);
        }
        ArrayList<a> arrayList2 = hashMap.get(-1);
        if (arrayList2 != null) {
            Iterator<a> it = arrayList2.iterator();
            while (it.hasNext()) {
                a next = it.next();
                String str = ((ConstraintLayout.b) kVar.f41433b.getLayoutParams()).f41618Y;
                String str2 = next.f41316c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    kVar.a(next);
                }
            }
        }
    }

    public final void c(a aVar) {
        Integer valueOf = Integer.valueOf(aVar.f41315b);
        HashMap<Integer, ArrayList<a>> hashMap = this.f41355a;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(aVar.f41315b), new ArrayList<>());
        }
        ArrayList<a> arrayList = hashMap.get(Integer.valueOf(aVar.f41315b));
        if (arrayList != null) {
            arrayList.add(aVar);
        }
    }

    public final ArrayList d() {
        return this.f41355a.get(-1);
    }

    public d(Context context, XmlResourceParser xmlResourceParser) {
        Exception e11;
        a aVar;
        Constructor<? extends a> constructor;
        HashMap<String, androidx.constraintlayout.widget.a> hashMap;
        HashMap<String, androidx.constraintlayout.widget.a> hashMap2;
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar2 = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    HashMap<String, Constructor<? extends a>> hashMap3 = f41354b;
                    if (hashMap3.containsKey(name)) {
                        try {
                            constructor = hashMap3.get(name);
                        } catch (Exception e12) {
                            a aVar3 = aVar2;
                            e11 = e12;
                            aVar = aVar3;
                        }
                        if (constructor != null) {
                            aVar = constructor.newInstance(new Object[0]);
                            try {
                                aVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                c(aVar);
                            } catch (Exception e13) {
                                e11 = e13;
                                Log.e("KeyFrames", "unable to create ", e11);
                                aVar2 = aVar;
                                eventType = xmlResourceParser.next();
                            }
                            aVar2 = aVar;
                        } else {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (aVar2 != null && (hashMap2 = aVar2.f41317d) != null) {
                            androidx.constraintlayout.widget.a.h(context, xmlResourceParser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && aVar2 != null && (hashMap = aVar2.f41317d) != null) {
                        androidx.constraintlayout.widget.a.h(context, xmlResourceParser, hashMap);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e14) {
            e14.printStackTrace();
        } catch (XmlPullParserException e15) {
            e15.printStackTrace();
        }
    }
}
