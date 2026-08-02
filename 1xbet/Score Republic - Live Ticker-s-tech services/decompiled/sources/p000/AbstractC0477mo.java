package p000;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: mo */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0477mo {

    /* JADX INFO: renamed from: a */
    public static final Object f5104a = new Object();

    /* JADX INFO: renamed from: b */
    public static final char[] f5105b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: c */
    public static final char[] f5106c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: d */
    public static final C0451lz f5107d;

    /* JADX INFO: renamed from: e */
    public static final C0451lz f5108e;

    /* JADX INFO: renamed from: f */
    public static final C0451lz f5109f;

    /* JADX INFO: renamed from: g */
    public static final C0451lz[] f5110g;

    static {
        C0451lz c0451lz = new C0451lz("commit_to_configuration_v2_api", -1, 1L, true);
        f5107d = c0451lz;
        C0451lz c0451lz2 = new C0451lz("get_serving_version_api", -1, 1L, true);
        C0451lz c0451lz3 = new C0451lz("get_experiment_tokens_api", -1, 1L, true);
        C0451lz c0451lz4 = new C0451lz("register_flag_update_listener_api", -1, 2L, true);
        f5108e = c0451lz4;
        C0451lz c0451lz5 = new C0451lz("sync_after_api", -1, 1L, true);
        C0451lz c0451lz6 = new C0451lz("sync_after_for_application_api", -1, 1L, true);
        C0451lz c0451lz7 = new C0451lz("set_app_wide_properties_api", -1, 1L, true);
        C0451lz c0451lz8 = new C0451lz("set_runtime_properties_api", -1, 1L, true);
        C0451lz c0451lz9 = new C0451lz("get_storage_info_api", -1, 1L, true);
        f5109f = c0451lz9;
        f5110g = new C0451lz[]{c0451lz, c0451lz2, c0451lz3, c0451lz4, c0451lz5, c0451lz6, c0451lz7, c0451lz8, c0451lz9};
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3405c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m3405c(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3406e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static final void m3407i(InterfaceC0180en interfaceC0180en, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC0328in.f3619a.iterator();
        while (it.hasNext()) {
            try {
                ((C0198f4) it.next()).getClass();
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    vt1.m5190a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            vt1.m5190a(th, new C0814vs(interfaceC0180en));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: j */
    public static List m3408j(Class cls, Iterable iterable, ClassLoader classLoader, aa0 aa0Var) {
        ?? Load;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object objNewInstance = null;
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
            Load = !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            switch (aa0Var.f114j) {
                case 4:
                    ((nj0) obj).getClass();
                    break;
                case 5:
                default:
                    ((fr0) obj).getClass();
                    break;
                case 6:
                    ((nl0) obj).getClass();
                    break;
            }
            arrayList.add(obj);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new e71(aa0Var)));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static void m3409k(Context context, String str) {
        synchronized (f5104a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
      0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static String m3410l(Context context) {
        String attributeValue;
        synchronized (f5104a) {
            attributeValue = "";
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException | XmlPullParserException unused3) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m3411n(vy0 vy0Var, y30 y30Var, r60 r60Var) {
        if (!(vy0Var instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) vy0Var).call();
            if (objCall == null) {
                EnumC0559ow.m3801a(y30Var);
                return true;
            }
            try {
                Object objApply = r60Var.apply(objCall);
                zg1.m5905p(objApply, "The mapper returned a null Publisher");
                vy0 vy0Var2 = (vy0) objApply;
                if (!(vy0Var2 instanceof Callable)) {
                    vy0Var2.mo1970a(y30Var);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) vy0Var2).call();
                    if (objCall2 == null) {
                        EnumC0559ow.m3801a(y30Var);
                        return true;
                    }
                    y30Var.mo933e(new b51(y30Var, objCall2));
                    return true;
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    EnumC0559ow.m3802b(th, y30Var);
                    return true;
                }
            } catch (Throwable th2) {
                wo1.m5394u(th2);
                EnumC0559ow.m3802b(th2, y30Var);
                return true;
            }
        } catch (Throwable th3) {
            wo1.m5394u(th3);
            EnumC0559ow.m3802b(th3, y30Var);
            return true;
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m3412p(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        RunnableC0452m runnableC0452m = new RunnableC0452m(level, exc, str, objArr, 10, false);
        int i = ja2.f3889a;
        executor.execute(new RunnableC0702sr(new k01(), s92.m4509a(), runnableC0452m, 19, false));
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0959zp mo960a(hj0 hj0Var);

    /* JADX INFO: renamed from: b */
    public abstract String mo3413b(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: d */
    public abstract int mo3414d(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: f */
    public abstract AbstractC0875xf mo961f();

    /* JADX INFO: renamed from: g */
    public abstract ScheduledExecutorService mo962g();

    /* JADX INFO: renamed from: h */
    public abstract gc1 mo963h();

    /* JADX INFO: renamed from: m */
    public abstract void mo964m();

    /* JADX INFO: renamed from: o */
    public abstract void mo965o(EnumC0474ml enumC0474ml, kj0 kj0Var);
}
