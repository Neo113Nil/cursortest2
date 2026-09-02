package com.goldenboot.saga.zone;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000  2\u00020\u0001:\u0001,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010!\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001dJ\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001dJ\u0015\u0010#\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u0013J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*¨\u0006-"}, d2 = {"Lcom/goldenboot/saga/zone/ServiceBroadcaster;", "", "", "charSequence", "", "start", "end", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "offset", "", "getPrevWordBeginningOnTwoWordsBoundary", "growPayload", "(IZ)I", "getNextWordEndOnTwoWordBoundary", "detachStream", "notifyMessage", "(I)Z", "reduceScope", "applyTask", "peekRevision", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(I)V", "drawField", "connectJob", "connectPatch", "(I)I", "attachConfig", "clipOrigin", "releaseHeader", "flushSample", "updateTimer", "popBlueprint", "serializeOffset", "Ljava/lang/CharSequence;", "injectMetric", "()Ljava/lang/CharSequence;", "I", "Ljava/text/BreakIterator;", "Ljava/text/BreakIterator;", "iterator", "ActivityMutator", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ServiceBroadcaster {
    private static final int flushSample = 50;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private final BreakIterator iterator;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final CharSequence charSequence;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final int start;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final int end;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int clipOrigin = 8;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/goldenboot/saga/zone/ServiceBroadcaster$ActivityMutator;", "", "<init>", "()V", "", "cp", "", "evictLayout", "(I)Z", "WINDOW_WIDTH", "I", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.ServiceBroadcaster$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean evictLayout(int cp) {
            int type = Character.getType(cp);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private Companion() {
        }
    }

    public ServiceBroadcaster(CharSequence charSequence, int i, int i2, Locale locale) {
        this.charSequence = charSequence;
        if (!(i >= 0 && i <= charSequence.length())) {
            EmitterUpgrade.releaseHeader("input start index is outside the CharSequence");
        }
        if (!(i2 >= 0 && i2 <= charSequence.length())) {
            EmitterUpgrade.releaseHeader("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i - 50);
        this.end = Math.min(charSequence.length(), i2 + flushSample);
        wordInstance.setText(new ItemShaper(charSequence, i, i2));
    }

    private final boolean applyTask(int offset) {
        int i = this.start + 1;
        if (offset > this.end || i > offset) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, offset))) {
            return true;
        }
        int i2 = offset - 1;
        if (Character.isSurrogate(this.charSequence.charAt(i2))) {
            return true;
        }
        if (!androidx.emoji2.text.FeedbackFlow.popBlueprint()) {
            return false;
        }
        androidx.emoji2.text.FeedbackFlow injectMetric = androidx.emoji2.text.FeedbackFlow.injectMetric();
        return injectMetric.clipOrigin() == 1 && injectMetric.releaseHeader(this.charSequence, i2) != -1;
    }

    private final boolean connectJob(int offset) {
        int i = offset - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(this.charSequence.charAt(i));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.areEqual(of, unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(offset)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(offset)), unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA);
    }

    private final int detachStream(int offset, boolean getNextWordEndOnTwoWordBoundary) {
        evictLayout(offset);
        if (applyTask(offset)) {
            return (!drawField(offset) || (peekRevision(offset) && getNextWordEndOnTwoWordBoundary)) ? connectPatch(offset) : offset;
        }
        if (peekRevision(offset)) {
            return connectPatch(offset);
        }
        return -1;
    }

    private final boolean drawField(int offset) {
        evictLayout(offset);
        if (!this.iterator.isBoundary(offset)) {
            return false;
        }
        if (peekRevision(offset) && peekRevision(offset - 1) && peekRevision(offset + 1)) {
            return false;
        }
        return offset <= 0 || offset >= this.charSequence.length() - 1 || !(connectJob(offset) || connectJob(offset + 1));
    }

    private final void evictLayout(int offset) {
        int i = this.start;
        boolean z = false;
        if (offset <= this.end && i <= offset) {
            z = true;
        }
        if (z) {
            return;
        }
        EmitterUpgrade.releaseHeader("Invalid offset: " + offset + ". Valid range is [" + this.start + " , " + this.end + ']');
    }

    private final int growPayload(int offset, boolean getPrevWordBeginningOnTwoWordsBoundary) {
        evictLayout(offset);
        if (peekRevision(offset)) {
            return (!drawField(offset) || (applyTask(offset) && getPrevWordBeginningOnTwoWordsBoundary)) ? attachConfig(offset) : offset;
        }
        if (applyTask(offset)) {
            return attachConfig(offset);
        }
        return -1;
    }

    private final boolean notifyMessage(int offset) {
        return serializeOffset(offset) && !popBlueprint(offset);
    }

    private final boolean peekRevision(int offset) {
        int i = this.start;
        if (offset >= this.end || i > offset) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.charSequence, offset)) || Character.isSurrogate(this.charSequence.charAt(offset))) {
            return true;
        }
        if (!androidx.emoji2.text.FeedbackFlow.popBlueprint()) {
            return false;
        }
        androidx.emoji2.text.FeedbackFlow injectMetric = androidx.emoji2.text.FeedbackFlow.injectMetric();
        return injectMetric.clipOrigin() == 1 && injectMetric.releaseHeader(this.charSequence, offset) != -1;
    }

    private final boolean reduceScope(int offset) {
        return !serializeOffset(offset) && popBlueprint(offset);
    }

    public final int attachConfig(int offset) {
        evictLayout(offset);
        int preceding = this.iterator.preceding(offset);
        return (peekRevision(preceding) && applyTask(preceding) && !connectJob(preceding)) ? attachConfig(preceding) : preceding;
    }

    public final int clipOrigin(int offset) {
        return growPayload(offset, true);
    }

    public final int connectPatch(int offset) {
        evictLayout(offset);
        int following = this.iterator.following(offset);
        return (peekRevision(following + (-1)) && peekRevision(following) && !connectJob(following)) ? connectPatch(following) : following;
    }

    public final int flushSample(int offset) {
        evictLayout(offset);
        while (offset != -1 && !notifyMessage(offset)) {
            offset = attachConfig(offset);
        }
        return offset;
    }

    /* renamed from: injectMetric, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    public final boolean popBlueprint(int offset) {
        int i = this.start + 1;
        if (offset > this.end || i > offset) {
            return false;
        }
        return INSTANCE.evictLayout(Character.codePointBefore(this.charSequence, offset));
    }

    public final int releaseHeader(int offset) {
        return detachStream(offset, true);
    }

    public final boolean serializeOffset(int offset) {
        int i = this.start;
        if (offset >= this.end || i > offset) {
            return false;
        }
        return INSTANCE.evictLayout(Character.codePointAt(this.charSequence, offset));
    }

    public final int updateTimer(int offset) {
        evictLayout(offset);
        while (offset != -1 && !reduceScope(offset)) {
            offset = connectPatch(offset);
        }
        return offset;
    }
}
