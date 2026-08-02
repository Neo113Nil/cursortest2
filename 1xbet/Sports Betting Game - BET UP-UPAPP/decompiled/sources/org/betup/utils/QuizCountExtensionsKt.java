package org.betup.utils;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.betup.model.remote.entity.quiz.QuizStateCountModel;

/* compiled from: QuizCountExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"getCountFromQuizCounts", "", "counts", "", "Lorg/betup/model/remote/entity/quiz/QuizStateCountModel;", "(Ljava/lang/Integer;Ljava/util/List;)I", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuizCountExtensionsKt {
    public static final int getCountFromQuizCounts(Integer num, List<QuizStateCountModel> list) {
        long count;
        if (list == null) {
            return 0;
        }
        if (num == null) {
            Iterator<T> it = list.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((QuizStateCountModel) it.next()).getCount();
            }
            return (int) j;
        }
        Object obj = null;
        if (num.intValue() != 4) {
            if (num.intValue() != 8) {
                if (num.intValue() != 2) {
                    if (num.intValue() != 1) {
                        if (num.intValue() != 32) {
                            return 0;
                        }
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (((QuizStateCountModel) next).getState() == 32) {
                                obj = next;
                                break;
                            }
                        }
                        QuizStateCountModel quizStateCountModel = (QuizStateCountModel) obj;
                        if (quizStateCountModel == null) {
                            return 0;
                        }
                        count = quizStateCountModel.getCount();
                    } else {
                        Iterator<T> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next2 = it3.next();
                            if (((QuizStateCountModel) next2).getState() == 1) {
                                obj = next2;
                                break;
                            }
                        }
                        QuizStateCountModel quizStateCountModel2 = (QuizStateCountModel) obj;
                        if (quizStateCountModel2 == null) {
                            return 0;
                        }
                        count = quizStateCountModel2.getCount();
                    }
                } else {
                    Iterator<T> it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next3 = it4.next();
                        if (((QuizStateCountModel) next3).getState() == 2) {
                            obj = next3;
                            break;
                        }
                    }
                    QuizStateCountModel quizStateCountModel3 = (QuizStateCountModel) obj;
                    if (quizStateCountModel3 == null) {
                        return 0;
                    }
                    count = quizStateCountModel3.getCount();
                }
            } else {
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next4 = it5.next();
                    if (((QuizStateCountModel) next4).getState() == 8) {
                        obj = next4;
                        break;
                    }
                }
                QuizStateCountModel quizStateCountModel4 = (QuizStateCountModel) obj;
                if (quizStateCountModel4 == null) {
                    return 0;
                }
                count = quizStateCountModel4.getCount();
            }
        } else {
            Iterator<T> it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next5 = it6.next();
                if (((QuizStateCountModel) next5).getState() == 4) {
                    obj = next5;
                    break;
                }
            }
            QuizStateCountModel quizStateCountModel5 = (QuizStateCountModel) obj;
            if (quizStateCountModel5 == null) {
                return 0;
            }
            count = quizStateCountModel5.getCount();
        }
        return (int) count;
    }
}
