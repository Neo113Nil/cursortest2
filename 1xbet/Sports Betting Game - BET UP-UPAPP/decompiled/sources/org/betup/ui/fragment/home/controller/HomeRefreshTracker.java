package org.betup.ui.fragment.home.controller;

import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeRefreshTracker.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u0014\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010J\u0006\u0010\u0011\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeRefreshTracker;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "pending", "", "Lorg/betup/ui/fragment/home/controller/HomeRefreshTracker$Section;", "isRefreshing", "", "()Z", "begin", "", "section", TtmlNode.END, "beginAll", "sections", "", "clear", "Section", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeRefreshTracker {
    public static final int $stable = 8;
    private final Set<Section> pending = new LinkedHashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HomeRefreshTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeRefreshTracker$Section;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Profile", "Stats", "Promo", "DailyQuests", "LiveMatches", "MoreMatches", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Section[] $VALUES;
        public static final Section Profile = new Section("Profile", 0);
        public static final Section Stats = new Section("Stats", 1);
        public static final Section Promo = new Section("Promo", 2);
        public static final Section DailyQuests = new Section("DailyQuests", 3);
        public static final Section LiveMatches = new Section("LiveMatches", 4);
        public static final Section MoreMatches = new Section("MoreMatches", 5);

        private static final /* synthetic */ Section[] $values() {
            return new Section[]{Profile, Stats, Promo, DailyQuests, LiveMatches, MoreMatches};
        }

        public static EnumEntries<Section> getEntries() {
            return $ENTRIES;
        }

        private Section(String str, int i) {
        }

        static {
            Section[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Section valueOf(String str) {
            return (Section) Enum.valueOf(Section.class, str);
        }

        public static Section[] values() {
            return (Section[]) $VALUES.clone();
        }
    }

    public final boolean isRefreshing() {
        return !this.pending.isEmpty();
    }

    public final void begin(Section section) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.pending.add(section);
    }

    public final void end(Section section) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.pending.remove(section);
    }

    public final void beginAll(Collection<? extends Section> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.pending.addAll(sections);
    }

    public final void clear() {
        this.pending.clear();
    }
}
