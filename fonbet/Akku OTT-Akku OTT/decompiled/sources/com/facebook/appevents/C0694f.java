package com.facebook.appevents;

import android.content.Context;
import com.facebook.appevents.C0689a;
import com.facebook.appevents.C0692d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.appevents.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0694f {

    /* renamed from: com.facebook.appevents.f$a */
    public static final class a extends ObjectInputStream {
        public static final C0077a Companion = new C0077a();

        /* renamed from: com.facebook.appevents.f$a$a, reason: collision with other inner class name */
        public static final class C0077a {
        }

        @Override // java.io.ObjectInputStream
        public final ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                resultClassDescriptor = ObjectStreamClass.lookup(C0689a.b.class);
            } else if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                resultClassDescriptor = ObjectStreamClass.lookup(C0692d.b.class);
            }
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    static {
        new C0694f();
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x003d: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:62), block:B:48:0x003d */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x003f: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:64), block:B:46:0x003f */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0041: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:66), block:B:41:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #9 {, blocks: (B:4:0x0003, B:15:0x002f, B:17:0x0074, B:37:0x004f, B:38:0x0058, B:49:0x0059, B:43:0x005f, B:47:0x0064, B:42:0x006b, B:8:0x000a, B:13:0x002c, B:29:0x004b, B:30:0x004e), top: B:3:0x0003, inners: #11 }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized D a() {
        D d;
        File fileStreamPath;
        D d2;
        D d3;
        D d4;
        Throwable th;
        synchronized (C0694f.class) {
            int i = com.facebook.appevents.internal.g.a;
            Context a2 = com.facebook.w.a();
            D d5 = null;
            try {
                try {
                    try {
                        FileInputStream openFileInput = a2.openFileInput("AppEventsLogger.persistedevents");
                        Intrinsics.checkNotNullExpressionValue(openFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                        a aVar = new a(new BufferedInputStream(openFileInput));
                        try {
                            Object readObject = aVar.readObject();
                            Intrinsics.checkNotNull(readObject, "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                            d = (D) readObject;
                            try {
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(aVar, null);
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    CloseableKt.closeFinally(aVar, th);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } finally {
                        try {
                            a2.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception unused) {
                        }
                    }
                } catch (FileNotFoundException unused2) {
                    d5 = d4;
                    fileStreamPath = a2.getFileStreamPath("AppEventsLogger.persistedevents");
                    fileStreamPath.delete();
                    d = d5;
                    if (d == null) {
                    }
                    return d;
                } catch (IOException unused3) {
                    d5 = d3;
                    fileStreamPath = a2.getFileStreamPath("AppEventsLogger.persistedevents");
                    fileStreamPath.delete();
                    d = d5;
                    if (d == null) {
                    }
                    return d;
                } catch (ClassNotFoundException unused4) {
                    d5 = d2;
                    fileStreamPath = a2.getFileStreamPath("AppEventsLogger.persistedevents");
                    fileStreamPath.delete();
                    d = d5;
                    if (d == null) {
                    }
                    return d;
                }
            } catch (FileNotFoundException unused5) {
                fileStreamPath = a2.getFileStreamPath("AppEventsLogger.persistedevents");
                fileStreamPath.delete();
                d = d5;
                if (d == null) {
                }
                return d;
            } catch (IOException unused6) {
                fileStreamPath = a2.getFileStreamPath("AppEventsLogger.persistedevents");
                fileStreamPath.delete();
                d = d5;
                if (d == null) {
                }
                return d;
            } catch (ClassNotFoundException unused7) {
                fileStreamPath = a2.getFileStreamPath("AppEventsLogger.persistedevents");
                fileStreamPath.delete();
                d = d5;
                if (d == null) {
                }
                return d;
            }
            if (d == null) {
                d = new D();
            }
        }
        return d;
    }

    @JvmStatic
    public static final void b(D d) {
        Context a2 = com.facebook.w.a();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(a2.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject(d);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(objectOutputStream, null);
            } finally {
            }
        } catch (IOException unused) {
            a2.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
    }
}
