package p169z;

import B.a;
import B.c;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f18284b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f18285a = new HashMap();

    static {
        HashMap map = new HashMap();
        f18284b = map;
        try {
            map.put("KeyAttribute", C1064e.class.getConstructor(null));
            map.put("KeyPosition", i.class.getConstructor(null));
            map.put("KeyCycle", f.class.getConstructor(null));
            map.put("KeyTimeCycle", j.class.getConstructor(null));
            map.put("KeyTrigger", k.class.getConstructor(null));
        } catch (NoSuchMethodException e7) {
            Log.e("KeyFrames", "unable to load", e7);
        }
    }

    public g(Context context, XmlResourceParser xmlResourceParser) {
        Exception e7;
        AbstractC1062c abstractC1062c;
        HashMap map;
        HashMap map2;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC1062c abstractC1062c2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap map3 = f18284b;
                    if (map3.containsKey(name)) {
                        try {
                            Constructor constructor = (Constructor) map3.get(name);
                            if (constructor == null) {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                            abstractC1062c = (AbstractC1062c) constructor.newInstance(null);
                            try {
                                abstractC1062c.c(context, Xml.asAttributeSet(xmlResourceParser));
                                b(abstractC1062c);
                            } catch (Exception e8) {
                                e7 = e8;
                                Log.e("KeyFrames", "unable to create ", e7);
                            }
                            abstractC1062c2 = abstractC1062c;
                        } catch (Exception e9) {
                            AbstractC1062c abstractC1062c3 = abstractC1062c2;
                            e7 = e9;
                            abstractC1062c = abstractC1062c3;
                        }
                        Log.e("KeyFrames", "unable to create ", e7);
                        abstractC1062c2 = abstractC1062c;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (abstractC1062c2 != null && (map2 = abstractC1062c2.f18268d) != null) {
                            a.d(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && abstractC1062c2 != null && (map = abstractC1062c2.f18268d) != null) {
                        a.d(context, xmlResourceParser, map);
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
        Integer numValueOf = Integer.valueOf(nVar.f18323c);
        HashMap map = this.f18285a;
        ArrayList arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList != null) {
            nVar.f18342w.addAll(arrayList);
        }
        ArrayList<AbstractC1062c> arrayList2 = (ArrayList) map.get(-1);
        if (arrayList2 != null) {
            for (AbstractC1062c abstractC1062c : arrayList2) {
                String str = ((c) nVar.f18322b.getLayoutParams()).f725Y;
                String str2 = abstractC1062c.f18267c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    nVar.a(abstractC1062c);
                }
            }
        }
    }

    public final void b(AbstractC1062c abstractC1062c) {
        Integer numValueOf = Integer.valueOf(abstractC1062c.f18266b);
        HashMap map = this.f18285a;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(abstractC1062c.f18266b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(abstractC1062c.f18266b));
        if (arrayList != null) {
            arrayList.add(abstractC1062c);
        }
    }
}
