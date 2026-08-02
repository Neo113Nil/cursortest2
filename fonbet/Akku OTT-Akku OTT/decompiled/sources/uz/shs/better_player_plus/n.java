package uz.shs.better_player_plus;

import io.flutter.plugin.common.EventChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements EventChannel.EventSink {
    public EventChannel.EventSink a;
    public final ArrayList<Object> b = new ArrayList<>();
    public boolean c;

    public static final class a {
    }

    public static final class b {
        public String a;
        public String b;
        public Object c;
    }

    public final void a() {
        if (this.a == null) {
            return;
        }
        ArrayList<Object> arrayList = this.b;
        Iterator<Object> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (next instanceof a) {
                EventChannel.EventSink eventSink = this.a;
                Intrinsics.checkNotNull(eventSink);
                eventSink.endOfStream();
            } else if (next instanceof b) {
                EventChannel.EventSink eventSink2 = this.a;
                Intrinsics.checkNotNull(eventSink2);
                b bVar = (b) next;
                eventSink2.error(bVar.a, bVar.b, bVar.c);
            } else {
                EventChannel.EventSink eventSink3 = this.a;
                Intrinsics.checkNotNull(eventSink3);
                eventSink3.success(next);
            }
        }
        arrayList.clear();
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void endOfStream() {
        a aVar = new a();
        if (!this.c) {
            this.b.add(aVar);
        }
        a();
        this.c = true;
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void error(String code, String message, Object details) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(details, "details");
        b bVar = new b();
        bVar.a = code;
        bVar.b = message;
        bVar.c = details;
        if (!this.c) {
            this.b.add(bVar);
        }
        a();
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void success(Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.c) {
            this.b.add(event);
        }
        a();
    }
}
