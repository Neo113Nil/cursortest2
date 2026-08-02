package com.neptunesoft.bacdz.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.bacdz.R;
import com.neptunesoft.bacdz.SplashScreen;
import com.neptunesoft.bacdz.adapter.TopicsAdapter;
import com.neptunesoft.bacdz.classobjects.Separate;
import com.neptunesoft.bacdz.classobjects.Topics;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public class TopicsFragment extends Fragment {
    public static List<Object> list;
    private final String[] files = {"bac-se-sciences-2025.pdf", "bac-sci-math-2025.pdf", "bac-se-physics-2025.pdf", "bac-sc-arabic-2025.pdf", "bac-sci-his-geo-2025.pdf", "bac-islamic-2025-1.pdf", "bac-sc-philo-2025.pdf", "bac-sc-english-2025-2.pdf", "bac-sci-french-2025.pdf", "bac2024-sciences-se.pdf", "bac2024-math-se.pdf", "bac2024-physics-se.pdf", "bac2024-arabic-sci.pdf", "bac2024-hisgeo-semtm.pdf", "bac2024-islamic.pdf", "bac2024-philo-sem.pdf", "bac2024-english-sci.pdf", "bac2024-french-sci.pdf", "bac2023-sciences-se.pdf", "bac2023-math-se.pdf", "bac2023-physique-se.pdf", "bac2023-arabic-se.pdf", "bac2023-hisgeo-semtm.pdf", "bac2023-islamic.pdf", "bac2023-philo-sem.pdf", "bac2023-english-sci.pdf", "bac2023-francais-se.pdf", "bac2022-sciences-se.pdf", "bac2022-math-se.pdf", "bac2022-physics-se.pdf", "bac2022-arabic-sci.pdf", "bac2022-hisgeo-semtm.pdf", "bac2022-islamic.pdf", "bac2022-philo-sem.pdf", "bac2022-english-sci.pdf", "bac2022-french-sci.pdf", "sciences-sci-bac2021.pdf", "math-sci-bac2021.pdf", "phisique-sci-bac2021.pdf", "arabic-sci-bac2021.pdf", "hisgeo-sci-bac2021.pdf", "islamique-sci-bac2021.pdf", "philo-sci-bac2021.pdf", "english-sci-bac2021.pdf", "francais-sci-bac2021.pdf", "sciences-se-bac2020.pdf", "math-se-bac2020.pdf", "physics-se-bac2020.pdf", "arabic-sci-bac2020.pdf", "hisgeo-semtm-bac2020.pdf", "islamic-bac2020.pdf", "philo-sem-bac2020.pdf", "english-sci-bac2020.pdf", "french-sci-bac2020.pdf", "sciences-se-bac2019.pdf", "math-se-bac2019.pdf", "physics-se-bac2019.pdf", "arabic-sci-bac2019.pdf", "hisgeo-semtm-bac2019.pdf", "islamic-bac2019.pdf", "philo-sem-bac2019.pdf", "english-sci-bac2019.pdf", "french-sci-bac2019.pdf", "sciences-se-bac2018.pdf", "math-se-bac2018.pdf", "physics-se-bac2018.pdf", "arabic-sci-bac2018.pdf", "hisgeo-semtm-bac2018.pdf", "islamic-bac2018.pdf", "philo-sem-bac2018.pdf", "english-sci-bac2018.pdf", "french-sci-bac2018.pdf", "bac2017_2-sciences-se.pdf", "bac2017_2-math-se.pdf", "bac2017_2-physics-se.pdf", "bac2017_2-arabic-sci.pdf", "bac2017_2-hisgeo-semtm.pdf", "bac2017_2-islamic.pdf", "bac2017_2-philo-sem.pdf", "bac2017_2-english-sci.pdf", "bac2017_2-french-sci.pdf", "sciences-se-bac2017.pdf", "math-se-bac2017.pdf", "physics-se-bac2017.pdf", "arabic-sci-bac2017.pdf", "hisgeo-semtm-bac2017.pdf", "islamic-bac2017.pdf", "philo-sem-bac2017.pdf", "english-sci-bac2017.pdf", "french-sci-bac2017.pdf", "sciences-se-bac2016_2.pdf", "math-se-bac2016_2.pdf", "physics-se-bac2016_2.pdf", "arabic-sci-bac2016.pdf", "hisgeo-semtm-bac2016_2.pdf", "islamic-bac2016.pdf", "philo-sem-bac2016_2.pdf", "english-sci-bac2016_2.pdf", "french-sci-bac2016_2.pdf", "sciences-se-bac2016.pdf", "math-se-bac2016.pdf", "physics-se-bac2016.pdf", "hisgeo-semtm-bac2016.pdf", "philo-sem-bac2016.pdf", "english-sci-bac2016.pdf", "french-sci-bac2016.pdf", "sciences-se-bac2015.pdf", "math-se-bac2015.pdf", "physics-se-bac2015.pdf", "arabic-sci-bac2015.pdf", "hisgeo-semtm-bac2015.pdf", "islamic-bac2015.pdf", "philo-sem-bac2015.pdf", "english-sci-bac2015.pdf", "french-sci-bac2015.pdf", "eddirasa-com-bac-sci-science-2014.pdf", "eddirasa-com-bac-sci-math-2014.pdf", "eddirasa-com-bac-sci-physique-2014.pdf", "eddirasa-com-bac-ge-ara-2014.pdf", "eddirasa-com-bac-sci-his-geo-2014.pdf", "eddirasa-com-bac-li-islamic-2014.pdf", "eddirasa-com-bac-sci-philo-2014.pdf", "eddirasa-com-bac-ge-eng-2014.pdf", "eddirasa-com-bac-ge-fra-2014.pdf", "eddirasa-com-bac-sci-science-2013.pdf", "eddirasa-com-bac-sci-math-2013.pdf", "eddirasa-com-bac-sci-physique-2013.pdf", "eddirasa-com-bac-ge-ara-2013.pdf", "eddirasa-com-bac-sci-his-geo-2013.pdf", "eddirasa-com-bac-li-islamic-2013.pdf", "eddirasa-com-bac-sci-philo-2013.pdf", "eddirasa-com-bac-ge-eng-2013.pdf", "eddirasa-com-bac-ge-fra-2013.pdf", "eddirasa-com-bac-sci-science-2012.pdf", "eddirasa-com-bac-sci-math-2012.pdf", "eddirasa-com-bac-sci-physique-2012.pdf", "eddirasa-com-bac-ge-ara-2012.pdf", "eddirasa-com-bac-sci-his-geo-2012.pdf", "eddirasa-com-bac-li-islamic-2012.pdf", "eddirasa-com-bac-sci-philo-2012.pdf", "eddirasa-com-bac-ge-eng-2012.pdf", "eddirasa-com-bac-ge-fra-2012.pdf", "eddirasa-com-bac-sci-science-2011.pdf", "eddirasa-com-bac-sci-math-2011.pdf", "eddirasa-com-bac-sci-physique-2011.pdf", "eddirasa-com-bac-ge-ara-2011.pdf", "eddirasa-com-bac-sci-his-geo-2011.pdf", "eddirasa-com-bac-li-islamic-2011.pdf", "eddirasa-com-bac-ge-philo-2011.pdf", "eddirasa-com-bac-ge-eng-2011.pdf", "eddirasa-com-bac-ge-fra-2011.pdf", "eddirasa-com-bac-sci-science-2010.pdf", "eddirasa-com-bac-sci-math-2010.pdf", "eddirasa-com-bac-sci-physique-2010.pdf", "eddirasa-com-bac-ge-ara-2010.pdf", "eddirasa-com-bac-sci-his-geo-2010.pdf", "eddirasa-com-bac-li-islamic-2010.pdf", "eddirasa-com-bac-ge-philo-2010.pdf", "eddirasa-com-bac-ge-eng-2010.pdf", "eddirasa-com-bac-ge-fra-2010.pdf", "eddirasa-bac-sci-science-2009.pdf", "eddirasa-bac-sci-math-2009.pdf", "eddirasa-bac-sci-physique-2009.pdf", "eddirasa-bac-ge-ara-2009.pdf", "eddirasa-bac-sci-his-geo-2009.pdf", "eddirasa-bac-li-islamic-2009.pdf", "eddirasa-bac-ge-philo-2009.pdf", "eddirasa-bac-ge-eng-2009.pdf", "eddirasa-bac-ge-fra-2009.pdf", "eddirasa-bac-sci-science-2008.pdf", "eddirasa-bac-sci-math-2008.pdf", "eddirasa-bac-sci-physique-2008.pdf", "eddirasa-bac-ge-ara-2008.pdf", "eddirasa-bac-sci-his-geo-2008.pdf", "eddirasa-bac-li-islamic-2008.pdf", "eddirasa-bac-ge-philo-2008.pdf", "eddirasa-bac-ge-eng-2008.pdf", "eddirasa-bac-ge-fra-2008.pdf"};
    View view;

    public boolean files_exist(String fileName) {
        return new File(requireActivity().getFilesDir(), fileName).exists();
    }

    private Topics prepareTopics(Topics topics, int position) {
        if (SplashScreen.darkmode) {
            if (files_exist(this.files[position])) {
                return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_circleinsidecircle_dark);
            }
            return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_download_dark);
        }
        if (files_exist(this.files[position])) {
            return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_circleinsidecircle);
        }
        return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_download);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList arrayList = new ArrayList();
        list = arrayList;
        arrayList.add(new Separate("بكالوريا 2025", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 0));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 1));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 2));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 3));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 4));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 5));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 6));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 7));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 8));
        list.add(new Separate("بكالوريا 2024", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 9));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 10));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 11));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 12));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 13));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 14));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 15));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 16));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 17));
        list.add(new Separate("بكالوريا 2023", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 18));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 19));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 20));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 21));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 22));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 23));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 24));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 25));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 26));
        list.add(new Separate("بكالوريا 2022", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 27));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 28));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 29));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 30));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 31));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 32));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 33));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 34));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 35));
        list.add(new Separate("بكالوريا 2021", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 36));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 37));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 38));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 39));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 40));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 41));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 42));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 43));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 44));
        list.add(new Separate("بكالوريا 2020", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 45));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 46));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 47));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 48));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 49));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 50));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 51));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 52));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 53));
        list.add(new Separate("بكالوريا 2019", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 54));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 55));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 56));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 57));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 58));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 59));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 60));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 61));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 62));
        list.add(new Separate("بكالوريا 2018", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 63));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 64));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 65));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 66));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 67));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 68));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 69));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 70));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 71));
        list.add(new Separate("بكالوريا 2017", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 2", 0), 72));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة 2", 0), 73));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 2", 0), 74));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 2", 0), 75));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة 2", 0), 76));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 2", 0), 77));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 2", 0), 78));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة 2", 0), 79));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة 2", 0), 80));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 1", 0), 81));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة 1", 0), 82));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 1", 0), 83));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 1", 0), 84));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة 1", 0), 85));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 1", 0), 86));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 1", 0), 87));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة 1", 0), 88));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة 1", 0), 89));
        list.add(new Separate("بكالوريا 2016", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 2", 0), 90));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة 2", 0), 91));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 2", 0), 92));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 2", 0), 93));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة 2", 0), 94));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 2", 0), 95));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 2", 0), 96));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة 2", 0), 97));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة 2", 0), 98));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة المسربة", 0), 99));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة المسربة", 0), 100));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة المسربة", 0), 101));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة المسربة", 0), 102));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة المسربة", 0), 103));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة المسربة", 0), 104));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة المسربة", 0), 105));
        list.add(new Separate("بكالوريا 2015", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 106));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 107));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 108));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 109));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 110));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 111));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 112));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 113));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 114));
        list.add(new Separate("بكالوريا 2014", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 115));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 116));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 117));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 118));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 119));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 120));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 121));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 122));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 123));
        list.add(new Separate("بكالوريا 2013", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 124));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 125));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 126));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 127));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 128));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), Opcodes.LOR));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 130));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), Opcodes.LXOR));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), Opcodes.IINC));
        list.add(new Separate("بكالوريا 2012", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), Opcodes.I2L));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), Opcodes.I2F));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), Opcodes.I2D));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), Opcodes.L2I));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), Opcodes.L2F));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), Opcodes.L2D));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), Opcodes.F2I));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), Opcodes.F2L));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), Opcodes.F2D));
        list.add(new Separate("بكالوريا 2011", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), Opcodes.D2I));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), Opcodes.D2L));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), Opcodes.D2F));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), Opcodes.I2B));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), Opcodes.I2C));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), Opcodes.I2S));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), Opcodes.LCMP));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), Opcodes.FCMPL));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), Opcodes.FCMPG));
        list.add(new Separate("بكالوريا 2010", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), Opcodes.DCMPL));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), Opcodes.DCMPG));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 153));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 154));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 155));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 156));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 157));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 158));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPEQ));
        list.add(new Separate("بكالوريا 2009", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPNE));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPLT));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPGE));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPGT));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPLE));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), Opcodes.IF_ACMPEQ));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), Opcodes.IF_ACMPNE));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), Opcodes.GOTO));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), Opcodes.JSR));
        list.add(new Separate("بكالوريا 2008", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), Opcodes.RET));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), Opcodes.TABLESWITCH));
        list.add(prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0), Opcodes.LOOKUPSWITCH));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), Opcodes.IRETURN));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), Opcodes.LRETURN));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), Opcodes.FRETURN));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), Opcodes.DRETURN));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), Opcodes.ARETURN));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), Opcodes.RETURN));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_topics, container, false);
        this.view = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.topicsRecyclerView);
        TopicsAdapter topicsAdapter = new TopicsAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(topicsAdapter);
        return this.view;
    }
}
