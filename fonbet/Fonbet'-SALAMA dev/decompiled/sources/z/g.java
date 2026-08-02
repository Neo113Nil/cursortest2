package z;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f18278b;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f18279a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f18278b = hashMap;
        try {
            hashMap.put("KeyAttribute", C1807e.class.getConstructor(null));
            hashMap.put("KeyPosition", i.class.getConstructor(null));
            hashMap.put("KeyCycle", f.class.getConstructor(null));
            hashMap.put("KeyTimeCycle", j.class.getConstructor(null));
            hashMap.put("KeyTrigger", k.class.getConstructor(null));
        } catch (NoSuchMethodException e7) {
            Log.e("KeyFrames", "unable to load", e7);
        }
    }

    public g(Context context, XmlResourceParser xmlResourceParser) {
        Exception e7;
        AbstractC1805c abstractC1805c;
        Constructor constructor;
        HashMap hashMap;
        HashMap hashMap2;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC1805c abstractC1805c2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap hashMap3 = f18278b;
                    if (hashMap3.containsKey(name)) {
                        try {
                            constructor = (Constructor) hashMap3.get(name);
                        } catch (Exception e8) {
                            AbstractC1805c abstractC1805c3 = abstractC1805c2;
                            e7 = e8;
                            abstractC1805c = abstractC1805c3;
                        }
                        if (constructor == null) {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                        }
                        abstractC1805c = (AbstractC1805c) constructor.newInstance(null);
                        try {
                            abstractC1805c.c(context, Xml.asAttributeSet(xmlResourceParser));
                            b(abstractC1805c);
                        } catch (Exception e9) {
                            e7 = e9;
                            Log.e("KeyFrames", "unable to create ", e7);
                            abstractC1805c2 = abstractC1805c;
                            eventType = xmlResourceParser.next();
                        }
                        abstractC1805c2 = abstractC1805c;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (abstractC1805c2 != null && (hashMap2 = abstractC1805c2.f18262d) != null) {
                            B.a.d(context, xmlResourceParser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && abstractC1805c2 != null && (hashMap = abstractC1805c2.f18262d) != null) {
                        B.a.d(context, xmlResourceParser, hashMap);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final void a(n nVar) {
        Integer valueOf = Integer.valueOf(nVar.f18317c);
        HashMap hashMap = this.f18279a;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            nVar.f18336w.addAll(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) hashMap.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC1805c abstractC1805c = (AbstractC1805c) it.next();
                String str = ((B.c) nVar.f18316b.getLayoutParams()).f725Y;
                String str2 = abstractC1805c.f18261c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    nVar.a(abstractC1805c);
                }
            }
        }
    }

    public final void b(AbstractC1805c abstractC1805c) {
        Integer valueOf = Integer.valueOf(abstractC1805c.f18260b);
        HashMap hashMap = this.f18279a;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(abstractC1805c.f18260b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(abstractC1805c.f18260b));
        if (arrayList != null) {
            arrayList.add(abstractC1805c);
        }
    }
}
