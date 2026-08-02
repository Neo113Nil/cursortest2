package org.betup.ui.common.compose;

import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NavigationImageHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0007J\b\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"Lorg/betup/ui/common/compose/NavigationImageHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getBattlesDrawable", "", "getCompetitionsDrawable", "getRankingDrawable", "getTvBetDrawable", "getMinigamesDrawable", "getTopMatchesDrawable", "getFlashBetDrawable", "getCurrentLanguageCode", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationImageHelper {
    public static final int $stable = 0;
    public static final NavigationImageHelper INSTANCE = new NavigationImageHelper();

    public final int getFlashBetDrawable() {
        return R.drawable.flash_ele;
    }

    public final int getTvBetDrawable() {
        return R.drawable.tv_bet_btn;
    }

    private NavigationImageHelper() {
    }

    public final int getBattlesDrawable() {
        String currentLanguageCode = getCurrentLanguageCode();
        int hashCode = currentLanguageCode.hashCode();
        if (hashCode != 3201) {
            if (hashCode != 3246) {
                if (hashCode != 3276) {
                    if (hashCode != 3329) {
                        if (hashCode != 3371) {
                            if (hashCode != 3588) {
                                if (hashCode != 3645) {
                                    if (hashCode != 3651) {
                                        if (hashCode != 3710) {
                                            if (hashCode == 3734 && currentLanguageCode.equals("uk")) {
                                                return R.drawable.home_left_battles_uk;
                                            }
                                        } else if (currentLanguageCode.equals("tr")) {
                                            return R.drawable.home_left_battles_tr;
                                        }
                                    } else if (currentLanguageCode.equals("ru")) {
                                        return R.drawable.home_left_battles_ru;
                                    }
                                } else if (currentLanguageCode.equals("ro")) {
                                    return R.drawable.home_left_battles_ro;
                                }
                            } else if (currentLanguageCode.equals(DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT)) {
                                return R.drawable.home_left_battles_pt;
                            }
                        } else if (currentLanguageCode.equals("it")) {
                            return R.drawable.home_left_battles_it;
                        }
                    } else if (currentLanguageCode.equals("hi")) {
                        return R.drawable.home_left_battles_hi;
                    }
                } else if (currentLanguageCode.equals("fr")) {
                    return R.drawable.home_left_battles_fr;
                }
            } else if (currentLanguageCode.equals("es")) {
                return R.drawable.home_left_battles_es;
            }
        } else if (currentLanguageCode.equals("de")) {
            return R.drawable.home_left_battles_de;
        }
        return R.drawable.home_left_battles;
    }

    public final int getCompetitionsDrawable() {
        String currentLanguageCode = getCurrentLanguageCode();
        int hashCode = currentLanguageCode.hashCode();
        if (hashCode != 3201) {
            if (hashCode != 3246) {
                if (hashCode != 3276) {
                    if (hashCode != 3329) {
                        if (hashCode != 3371) {
                            if (hashCode != 3588) {
                                if (hashCode != 3645) {
                                    if (hashCode != 3651) {
                                        if (hashCode != 3710) {
                                            if (hashCode == 3734 && currentLanguageCode.equals("uk")) {
                                                return R.drawable.home_right_competitions_uk;
                                            }
                                        } else if (currentLanguageCode.equals("tr")) {
                                            return R.drawable.home_right_competitions_tr;
                                        }
                                    } else if (currentLanguageCode.equals("ru")) {
                                        return R.drawable.home_right_competitions_ru;
                                    }
                                } else if (currentLanguageCode.equals("ro")) {
                                    return R.drawable.home_right_competitions_ro;
                                }
                            } else if (currentLanguageCode.equals(DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT)) {
                                return R.drawable.home_right_competitions_pt;
                            }
                        } else if (currentLanguageCode.equals("it")) {
                            return R.drawable.home_right_competitions_it;
                        }
                    } else if (currentLanguageCode.equals("hi")) {
                        return R.drawable.home_right_competitions_hi;
                    }
                } else if (currentLanguageCode.equals("fr")) {
                    return R.drawable.home_right_competitions_fr;
                }
            } else if (currentLanguageCode.equals("es")) {
                return R.drawable.home_right_competitions_es;
            }
        } else if (currentLanguageCode.equals("de")) {
            return R.drawable.home_right_competitions_de;
        }
        return R.drawable.home_right_competitions;
    }

    public final int getRankingDrawable() {
        String currentLanguageCode = getCurrentLanguageCode();
        int hashCode = currentLanguageCode.hashCode();
        if (hashCode != 3201) {
            if (hashCode != 3246) {
                if (hashCode != 3276) {
                    if (hashCode != 3329) {
                        if (hashCode != 3371) {
                            if (hashCode != 3588) {
                                if (hashCode != 3645) {
                                    if (hashCode != 3651) {
                                        if (hashCode != 3710) {
                                            if (hashCode == 3734 && currentLanguageCode.equals("uk")) {
                                                return R.drawable.button_ranking_home_uk;
                                            }
                                        } else if (currentLanguageCode.equals("tr")) {
                                            return R.drawable.button_ranking_home_tr;
                                        }
                                    } else if (currentLanguageCode.equals("ru")) {
                                        return R.drawable.button_ranking_home_ru;
                                    }
                                } else if (currentLanguageCode.equals("ro")) {
                                    return R.drawable.button_ranking_home_ro;
                                }
                            } else if (currentLanguageCode.equals(DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT)) {
                                return R.drawable.button_ranking_home_pt;
                            }
                        } else if (currentLanguageCode.equals("it")) {
                            return R.drawable.button_ranking_home_it;
                        }
                    } else if (currentLanguageCode.equals("hi")) {
                        return R.drawable.button_ranking_home_hi;
                    }
                } else if (currentLanguageCode.equals("fr")) {
                    return R.drawable.button_ranking_home_fr;
                }
            } else if (currentLanguageCode.equals("es")) {
                return R.drawable.button_ranking_home_es;
            }
        } else if (currentLanguageCode.equals("de")) {
            return R.drawable.button_ranking_home_de;
        }
        return R.drawable.button_ranking_home;
    }

    public final int getMinigamesDrawable() {
        String currentLanguageCode = getCurrentLanguageCode();
        int hashCode = currentLanguageCode.hashCode();
        if (hashCode != 3201) {
            if (hashCode != 3246) {
                if (hashCode != 3276) {
                    if (hashCode != 3329) {
                        if (hashCode != 3371) {
                            if (hashCode != 3588) {
                                if (hashCode != 3645) {
                                    if (hashCode != 3651) {
                                        if (hashCode != 3710) {
                                            if (hashCode == 3734 && currentLanguageCode.equals("uk")) {
                                                return R.drawable.button_minigames_home_uk;
                                            }
                                        } else if (currentLanguageCode.equals("tr")) {
                                            return R.drawable.button_minigames_home_tr;
                                        }
                                    } else if (currentLanguageCode.equals("ru")) {
                                        return R.drawable.button_minigames_home_ru;
                                    }
                                } else if (currentLanguageCode.equals("ro")) {
                                    return R.drawable.button_minigames_home_ro;
                                }
                            } else if (currentLanguageCode.equals(DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT)) {
                                return R.drawable.button_minigames_home_pt;
                            }
                        } else if (currentLanguageCode.equals("it")) {
                            return R.drawable.button_minigames_home_it;
                        }
                    } else if (currentLanguageCode.equals("hi")) {
                        return R.drawable.button_minigames_home_hi;
                    }
                } else if (currentLanguageCode.equals("fr")) {
                    return R.drawable.button_minigames_home_fr;
                }
            } else if (currentLanguageCode.equals("es")) {
                return R.drawable.button_minigames_home_es;
            }
        } else if (currentLanguageCode.equals("de")) {
            return R.drawable.button_minigames_home_de;
        }
        return R.drawable.button_minigames_home;
    }

    public final int getTopMatchesDrawable() {
        String currentLanguageCode = getCurrentLanguageCode();
        int hashCode = currentLanguageCode.hashCode();
        if (hashCode != 3201) {
            if (hashCode != 3246) {
                if (hashCode != 3276) {
                    if (hashCode != 3329) {
                        if (hashCode != 3371) {
                            if (hashCode != 3588) {
                                if (hashCode != 3645) {
                                    if (hashCode != 3651) {
                                        if (hashCode != 3710) {
                                            if (hashCode == 3734 && currentLanguageCode.equals("uk")) {
                                                return R.drawable.button_top_matches_home_uk;
                                            }
                                        } else if (currentLanguageCode.equals("tr")) {
                                            return R.drawable.button_top_matches_home_tr;
                                        }
                                    } else if (currentLanguageCode.equals("ru")) {
                                        return R.drawable.button_top_matches_home_ru;
                                    }
                                } else if (currentLanguageCode.equals("ro")) {
                                    return R.drawable.button_top_matches_home_ro;
                                }
                            } else if (currentLanguageCode.equals(DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT)) {
                                return R.drawable.button_top_matches_home_pt;
                            }
                        } else if (currentLanguageCode.equals("it")) {
                            return R.drawable.button_top_matches_home_it;
                        }
                    } else if (currentLanguageCode.equals("hi")) {
                        return R.drawable.button_top_matches_home_hi;
                    }
                } else if (currentLanguageCode.equals("fr")) {
                    return R.drawable.button_top_matches_home_fr;
                }
            } else if (currentLanguageCode.equals("es")) {
                return R.drawable.button_top_matches_home_es;
            }
        } else if (currentLanguageCode.equals("de")) {
            return R.drawable.button_top_matches_home_de;
        }
        return R.drawable.button_top_matches_home;
    }

    private final String getCurrentLanguageCode() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }
}
