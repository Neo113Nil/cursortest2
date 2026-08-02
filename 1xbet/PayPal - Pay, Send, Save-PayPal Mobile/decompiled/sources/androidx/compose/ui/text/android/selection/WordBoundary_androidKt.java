package androidx.compose.ui.text.android.selection;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "offset", "getWordStart", "(Landroidx/compose/ui/text/android/selection/WordIterator;I)I", "getWordEnd"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WordBoundary_androidKt {
    public static final int getWordStart(androidx.compose.ui.text.android.selection.WordIterator wordIterator, int i) {
        int prevWordBeginningOnTwoWordsBoundary;
        if (wordIterator.isOnPunctuation(wordIterator.prevBoundary(i))) {
            prevWordBeginningOnTwoWordsBoundary = wordIterator.getPunctuationBeginning(i);
        } else {
            prevWordBeginningOnTwoWordsBoundary = wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i);
        }
        return prevWordBeginningOnTwoWordsBoundary == -1 ? i : prevWordBeginningOnTwoWordsBoundary;
    }

    public static final int getWordEnd(androidx.compose.ui.text.android.selection.WordIterator wordIterator, int i) {
        int nextWordEndOnTwoWordBoundary;
        if (wordIterator.isAfterPunctuation(wordIterator.nextBoundary(i))) {
            nextWordEndOnTwoWordBoundary = wordIterator.getPunctuationEnd(i);
        } else {
            nextWordEndOnTwoWordBoundary = wordIterator.getNextWordEndOnTwoWordBoundary(i);
        }
        return nextWordEndOnTwoWordBoundary == -1 ? i : nextWordEndOnTwoWordBoundary;
    }
}
