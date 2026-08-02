package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
final class f {

    /* renamed from: e, reason: collision with root package name */
    private static final Class<?>[] f44594e = {Context.class, AttributeSet.class};

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, Constructor> f44595f = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final Context f44596a;

    /* renamed from: c, reason: collision with root package name */
    private g f44598c;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f44597b = new Object[2];

    /* renamed from: d, reason: collision with root package name */
    private String[] f44599d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public f(Context context, g gVar) {
        this.f44596a = context;
        this.f44598c = gVar;
    }

    private Preference a(@NonNull String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        Class<?> cls;
        HashMap<String, Constructor> hashMap = f44595f;
        Constructor<?> constructor = hashMap.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f44596a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e11 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e12) {
                                e11 = e12;
                            }
                        }
                        if (cls == null) {
                            if (e11 != null) {
                                throw e11;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                        constructor = cls.getConstructor(f44594e);
                        constructor.setAccessible(true);
                        hashMap.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(f44594e);
                    constructor.setAccessible(true);
                    hashMap.put(str, constructor);
                } catch (Exception e13) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e13);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e14) {
                throw e14;
            }
        }
        Object[] objArr = this.f44597b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f44599d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e11) {
            throw e11;
        } catch (ClassNotFoundException e12) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e12);
            throw inflateException;
        } catch (Exception e13) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e13);
            throw inflateException2;
        }
    }

    private void e(XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                boolean equals = "intent".equals(name);
                Context context = this.f44596a;
                if (equals) {
                    try {
                        preference.Z(Intent.parseIntent(context.getResources(), xmlResourceParser, attributeSet));
                    } catch (IOException e11) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e11);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    context.getResources().parseBundleExtra("extra", attributeSet, preference.f());
                    try {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 != 1 && (next2 != 3 || xmlResourceParser.getDepth() > depth2)) {
                            }
                        }
                    } catch (IOException e12) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e12);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference b11 = b(name, attributeSet);
                    ((PreferenceGroup) preference).k0(b11);
                    e(xmlResourceParser, b11, attributeSet);
                }
            }
        }
    }

    public final PreferenceGroup c() {
        XmlResourceParser xml = this.f44596a.getResources().getXml(R.xml.preferences);
        try {
            return d(xml);
        } finally {
            xml.close();
        }
    }

    public final PreferenceGroup d(XmlResourceParser xmlResourceParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.f44597b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f44597b[0] = this.f44596a;
            do {
                try {
                    try {
                        next = xmlResourceParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (InflateException e11) {
                        throw e11;
                    }
                } catch (IOException e12) {
                    InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e12.getMessage());
                    inflateException.initCause(e12);
                    throw inflateException;
                } catch (XmlPullParserException e13) {
                    InflateException inflateException2 = new InflateException(e13.getMessage());
                    inflateException2.initCause(e13);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroup = (PreferenceGroup) b(xmlResourceParser.getName(), asAttributeSet);
            preferenceGroup.G(this.f44598c);
            e(xmlResourceParser, preferenceGroup, asAttributeSet);
        }
        return preferenceGroup;
    }
}
