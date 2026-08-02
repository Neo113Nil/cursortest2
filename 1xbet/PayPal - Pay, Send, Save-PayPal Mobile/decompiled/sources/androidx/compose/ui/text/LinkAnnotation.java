package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "<init>", "()V", "Landroidx/compose/ui/text/LinkInteractionListener;", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "linkInteractionListener", "Landroidx/compose/ui/text/TextLinkStyles;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "styles", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Url, "Clickable"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LinkAnnotation implements androidx.compose.ui.text.AnnotatedString.Annotation {
    public static final int $stable = 0;

    public abstract androidx.compose.ui.text.LinkInteractionListener getLinkInteractionListener();

    public abstract androidx.compose.ui.text.TextLinkStyles getStyles();

    private LinkAnnotation() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Url;", "Landroidx/compose/ui/text/LinkAnnotation;", "", "url", "Landroidx/compose/ui/text/TextLinkStyles;", "styles", "Landroidx/compose/ui/text/LinkInteractionListener;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "copy", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)Landroidx/compose/ui/text/LinkAnnotation$Url;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getUrl", "Landroidx/compose/ui/text/TextLinkStyles;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "Landroidx/compose/ui/text/LinkInteractionListener;", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Url extends androidx.compose.ui.text.LinkAnnotation {
        public static final int $stable = 8;
        private final androidx.compose.ui.text.LinkInteractionListener linkInteractionListener;
        private final androidx.compose.ui.text.TextLinkStyles styles;
        private final java.lang.String url;

        public Url(java.lang.String str, androidx.compose.ui.text.TextLinkStyles textLinkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener) {
            super(null);
            this.url = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }

        public /* synthetic */ Url(java.lang.String str, androidx.compose.ui.text.TextLinkStyles textLinkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : textLinkStyles, (i & 4) != 0 ? null : linkInteractionListener);
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final androidx.compose.ui.text.TextLinkStyles getStyles() {
            return this.styles;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final androidx.compose.ui.text.LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        public static /* synthetic */ androidx.compose.ui.text.LinkAnnotation.Url copy$default(androidx.compose.ui.text.LinkAnnotation.Url url, java.lang.String str, androidx.compose.ui.text.TextLinkStyles textLinkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = url.url;
            }
            if ((i & 2) != 0) {
                textLinkStyles = url.getStyles();
            }
            if ((i & 4) != 0) {
                linkInteractionListener = url.getLinkInteractionListener();
            }
            return url.copy(str, textLinkStyles, linkInteractionListener);
        }

        public final androidx.compose.ui.text.LinkAnnotation.Url copy(java.lang.String url, androidx.compose.ui.text.TextLinkStyles styles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener) {
            return new androidx.compose.ui.text.LinkAnnotation.Url(url, styles, linkInteractionListener);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.text.LinkAnnotation.Url)) {
                return false;
            }
            androidx.compose.ui.text.LinkAnnotation.Url url = (androidx.compose.ui.text.LinkAnnotation.Url) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, url.url) && kotlin.jvm.internal.Intrinsics.areEqual(getStyles(), url.getStyles()) && kotlin.jvm.internal.Intrinsics.areEqual(getLinkInteractionListener(), url.getLinkInteractionListener());
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            androidx.compose.ui.text.TextLinkStyles styles = getStyles();
            int hashCode2 = styles != null ? styles.hashCode() : 0;
            androidx.compose.ui.text.LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return (((hashCode * 31) + hashCode2) * 31) + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkAnnotation.Url(url=");
            sb.append(this.url);
            sb.append(')');
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "Landroidx/compose/ui/text/LinkAnnotation;", "", "tag", "Landroidx/compose/ui/text/TextLinkStyles;", "styles", "Landroidx/compose/ui/text/LinkInteractionListener;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "copy", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getTag", "Landroidx/compose/ui/text/TextLinkStyles;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "Landroidx/compose/ui/text/LinkInteractionListener;", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Clickable extends androidx.compose.ui.text.LinkAnnotation {
        public static final int $stable = 8;
        private final androidx.compose.ui.text.LinkInteractionListener linkInteractionListener;
        private final androidx.compose.ui.text.TextLinkStyles styles;
        private final java.lang.String tag;

        public Clickable(java.lang.String str, androidx.compose.ui.text.TextLinkStyles textLinkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener) {
            super(null);
            this.tag = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }

        public /* synthetic */ Clickable(java.lang.String str, androidx.compose.ui.text.TextLinkStyles textLinkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : textLinkStyles, linkInteractionListener);
        }

        public final java.lang.String getTag() {
            return this.tag;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final androidx.compose.ui.text.TextLinkStyles getStyles() {
            return this.styles;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final androidx.compose.ui.text.LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        public static /* synthetic */ androidx.compose.ui.text.LinkAnnotation.Clickable copy$default(androidx.compose.ui.text.LinkAnnotation.Clickable clickable, java.lang.String str, androidx.compose.ui.text.TextLinkStyles textLinkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = clickable.tag;
            }
            if ((i & 2) != 0) {
                textLinkStyles = clickable.getStyles();
            }
            if ((i & 4) != 0) {
                linkInteractionListener = clickable.getLinkInteractionListener();
            }
            return clickable.copy(str, textLinkStyles, linkInteractionListener);
        }

        public final androidx.compose.ui.text.LinkAnnotation.Clickable copy(java.lang.String tag, androidx.compose.ui.text.TextLinkStyles styles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener) {
            return new androidx.compose.ui.text.LinkAnnotation.Clickable(tag, styles, linkInteractionListener);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.text.LinkAnnotation.Clickable)) {
                return false;
            }
            androidx.compose.ui.text.LinkAnnotation.Clickable clickable = (androidx.compose.ui.text.LinkAnnotation.Clickable) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.tag, clickable.tag) && kotlin.jvm.internal.Intrinsics.areEqual(getStyles(), clickable.getStyles()) && kotlin.jvm.internal.Intrinsics.areEqual(getLinkInteractionListener(), clickable.getLinkInteractionListener());
        }

        public final int hashCode() {
            int hashCode = this.tag.hashCode();
            androidx.compose.ui.text.TextLinkStyles styles = getStyles();
            int hashCode2 = styles != null ? styles.hashCode() : 0;
            androidx.compose.ui.text.LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return (((hashCode * 31) + hashCode2) * 31) + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkAnnotation.Clickable(tag=");
            sb.append(this.tag);
            sb.append(')');
            return sb.toString();
        }
    }

    public /* synthetic */ LinkAnnotation(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
