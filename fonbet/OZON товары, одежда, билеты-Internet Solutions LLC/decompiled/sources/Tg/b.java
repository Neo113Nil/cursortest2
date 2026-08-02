package Tg;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface b {

    public interface a extends b {
    }

    /* renamed from: Tg.b$b, reason: collision with other inner class name */
    public interface InterfaceC0546b extends b {
        String getLink();
    }

    /* loaded from: classes10.dex */
    public interface c extends b {
        String getLink();

        f getScrollTo();
    }

    public interface d extends b {
        String getLink();
    }

    /* loaded from: classes10.dex */
    public interface e extends b {
        String getLink();

        f getScrollTo();
    }

    /* loaded from: classes10.dex */
    public interface f {

        public interface a<Info> extends f {
            Info getAdditionalInfo();
        }

        /* renamed from: Tg.b$f$b, reason: collision with other inner class name */
        public interface InterfaceC0547b extends f {
        }
    }

    /* loaded from: classes10.dex */
    public interface g extends b {
        @NotNull
        String getWidgetName();
    }

    String getId();
}
