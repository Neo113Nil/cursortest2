package com.neptunesoft.bacdz.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.bacdz.R;
import com.neptunesoft.bacdz.SplashScreen;
import com.neptunesoft.bacdz.TopicsSolutionsActivity;
import com.neptunesoft.bacdz.adapter.TopicsAdapter;
import com.neptunesoft.bacdz.classobjects.Separate;
import com.neptunesoft.bacdz.classobjects.Topics;
import com.neptunesoft.bacdz.fragment.TopicsFragment;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public class TopicsAdapter extends RecyclerView.Adapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static List list;
    static TopicsHolder topicsHolder;

    public TopicsAdapter(List list2) {
        list = list2;
    }

    private static Topics prepareTopics(Topics topics) {
        if (SplashScreen.darkmode) {
            return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_circleinsidecircle_dark);
        }
        return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_circleinsidecircle);
    }

    public static void change() {
        Topics prepareTopics;
        switch (topicsHolder.getBindingAdapterPosition()) {
            case 1:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 2:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 3:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 4:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 5:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 6:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 7:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 8:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 9:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 10:
            case 20:
            case 30:
            case 40:
            case 50:
            case 60:
            case 70:
            case 80:
            case 99:
            case 116:
            case 126:
            case Opcodes.L2I /* 136 */:
            case Opcodes.I2C /* 146 */:
            case 156:
            case Opcodes.IF_ACMPNE /* 166 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            default:
                prepareTopics = null;
                break;
            case 11:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 12:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 13:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 14:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 15:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 16:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 17:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 18:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 19:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 21:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 22:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 23:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 24:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 25:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 26:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 27:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 28:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 29:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 31:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 32:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 33:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 34:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 35:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 36:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 37:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 38:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 39:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 41:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 42:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 43:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 44:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 45:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 46:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 47:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 48:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 49:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 51:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 52:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 53:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 54:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 55:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 56:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 57:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 58:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 59:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 61:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 62:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 63:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 64:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 65:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 66:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 67:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 68:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 69:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 71:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 72:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 73:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 74:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 75:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 76:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 77:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 78:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 79:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 81:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 82:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 83:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 84:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 85:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 86:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 87:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 2", 0));
                break;
            case 88:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 89:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 90:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 91:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 92:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 93:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 94:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 95:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 96:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 1", 0));
                break;
            case 97:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 98:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 100:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 101:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 102:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 103:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 104:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 105:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 106:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 2", 0));
                break;
            case 107:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 108:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 109:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 110:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 111:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 112:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 113:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة المسربة", 0));
                break;
            case 114:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 115:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 117:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 118:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 119:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 120:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 121:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 122:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 123:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 124:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 125:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 127:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 128:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LOR /* 129 */:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 130:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LXOR /* 131 */:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IINC /* 132 */:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2L /* 133 */:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.I2F /* 134 */:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2D /* 135 */:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.L2F /* 137 */:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.L2D /* 138 */:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.F2I /* 139 */:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.F2L /* 140 */:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.F2D /* 141 */:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.D2I /* 142 */:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.D2L /* 143 */:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.D2F /* 144 */:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2B /* 145 */:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2S /* 147 */:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LCMP /* 148 */:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.FCMPL /* 149 */:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.FCMPG /* 150 */:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.DCMPL /* 151 */:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.DCMPG /* 152 */:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 153:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 154:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 155:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 157:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 158:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ICMPEQ /* 159 */:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ICMPNE /* 160 */:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ICMPLT /* 161 */:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ICMPGE /* 162 */:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ICMPGT /* 163 */:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.IF_ICMPLE /* 164 */:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ACMPEQ /* 165 */:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.GOTO /* 167 */:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.JSR /* 168 */:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.RET /* 169 */:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.TABLESWITCH /* 170 */:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LOOKUPSWITCH /* 171 */:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IRETURN /* 172 */:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LRETURN /* 173 */:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.FRETURN /* 174 */:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.DRETURN /* 175 */:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.RETURN /* 177 */:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.GETSTATIC /* 178 */:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.PUTSTATIC /* 179 */:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.GETFIELD /* 180 */:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.PUTFIELD /* 181 */:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.INVOKEVIRTUAL /* 182 */:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.INVOKESPECIAL /* 183 */:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.INVOKESTATIC /* 184 */:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.INVOKEINTERFACE /* 185 */:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.NEW /* 187 */:
                prepareTopics = prepareTopics(new Topics("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.NEWARRAY /* 188 */:
                prepareTopics = prepareTopics(new Topics("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.ANEWARRAY /* 189 */:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.ARRAYLENGTH /* 190 */:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.ATHROW /* 191 */:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.CHECKCAST /* 192 */:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.INSTANCEOF /* 193 */:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.MONITORENTER /* 194 */:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.MONITOREXIT /* 195 */:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
        }
        TopicsFragment.list.set(topicsHolder.getBindingAdapterPosition(), prepareTopics);
        list.set(topicsHolder.getBindingAdapterPosition(), prepareTopics);
        topicsHolder.imgItemTopicsSolutions.setImageResource(prepareTopics.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (getItemViewType(viewType) == 0) {
            return new SeparatesHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_separate_years, parent, false));
        }
        final TopicsHolder topicsHolder2 = new TopicsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_topics_solutions, parent, false));
        topicsHolder = topicsHolder2;
        topicsHolder2.lytItemTopicsSolution.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.adapter.TopicsAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopicsAdapter.lambda$onCreateViewHolder$0(TopicsAdapter.TopicsHolder.this, view);
            }
        });
        return topicsHolder2;
    }

    static /* synthetic */ void lambda$onCreateViewHolder$0(TopicsHolder topicsHolder2, View view) {
        String str;
        TopicsSolutionsActivity.topics = true;
        topicsHolder = topicsHolder2;
        switch (topicsHolder2.getBindingAdapterPosition()) {
            case 1:
                str = "bac-se-sciences-2025.pdf";
                break;
            case 2:
                str = "bac-sci-math-2025.pdf";
                break;
            case 3:
                str = "bac-se-physics-2025.pdf";
                break;
            case 4:
                str = "bac-sc-arabic-2025.pdf";
                break;
            case 5:
                str = "bac-sci-his-geo-2025.pdf";
                break;
            case 6:
                str = "bac-islamic-2025-1.pdf";
                break;
            case 7:
                str = "bac-sc-philo-2025.pdf";
                break;
            case 8:
                str = "bac-sc-english-2025-2.pdf";
                break;
            case 9:
                str = "bac-sci-french-2025.pdf";
                break;
            case 10:
            case 20:
            case 30:
            case 40:
            case 50:
            case 60:
            case 70:
            case 80:
            case 99:
            case 116:
            case 126:
            case Opcodes.L2I /* 136 */:
            case Opcodes.I2C /* 146 */:
            case 156:
            case Opcodes.IF_ACMPNE /* 166 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            default:
                str = null;
                break;
            case 11:
                str = "bac2024-sciences-se.pdf";
                break;
            case 12:
                str = "bac2024-math-se.pdf";
                break;
            case 13:
                str = "bac2024-physics-se.pdf";
                break;
            case 14:
                str = "bac2024-arabic-sci.pdf";
                break;
            case 15:
                str = "bac2024-hisgeo-semtm.pdf";
                break;
            case 16:
                str = "bac2024-islamic.pdf";
                break;
            case 17:
                str = "bac2024-philo-sem.pdf";
                break;
            case 18:
                str = "bac2024-english-sci.pdf";
                break;
            case 19:
                str = "bac2024-french-sci.pdf";
                break;
            case 21:
                str = "bac2023-sciences-se.pdf";
                break;
            case 22:
                str = "bac2023-math-se.pdf";
                break;
            case 23:
                str = "bac2023-physique-se.pdf";
                break;
            case 24:
                str = "bac2023-arabic-se.pdf";
                break;
            case 25:
                str = "bac2023-hisgeo-semtm.pdf";
                break;
            case 26:
                str = "bac2023-islamic.pdf";
                break;
            case 27:
                str = "bac2023-philo-sem.pdf";
                break;
            case 28:
                str = "bac2023-english-sci.pdf";
                break;
            case 29:
                str = "bac2023-francais-se.pdf";
                break;
            case 31:
                str = "bac2022-sciences-se.pdf";
                break;
            case 32:
                str = "bac2022-math-se.pdf";
                break;
            case 33:
                str = "bac2022-physics-se.pdf";
                break;
            case 34:
                str = "bac2022-arabic-sci.pdf";
                break;
            case 35:
                str = "bac2022-hisgeo-semtm.pdf";
                break;
            case 36:
                str = "bac2022-islamic.pdf";
                break;
            case 37:
                str = "bac2022-philo-sem.pdf";
                break;
            case 38:
                str = "bac2022-english-sci.pdf";
                break;
            case 39:
                str = "bac2022-french-sci.pdf";
                break;
            case 41:
                str = "sciences-sci-bac2021.pdf";
                break;
            case 42:
                str = "math-sci-bac2021.pdf";
                break;
            case 43:
                str = "phisique-sci-bac2021.pdf";
                break;
            case 44:
                str = "arabic-sci-bac2021.pdf";
                break;
            case 45:
                str = "hisgeo-sci-bac2021.pdf";
                break;
            case 46:
                str = "islamique-sci-bac2021.pdf";
                break;
            case 47:
                str = "philo-sci-bac2021.pdf";
                break;
            case 48:
                str = "english-sci-bac2021.pdf";
                break;
            case 49:
                str = "francais-sci-bac2021.pdf";
                break;
            case 51:
                str = "sciences-se-bac2020.pdf";
                break;
            case 52:
                str = "math-se-bac2020.pdf";
                break;
            case 53:
                str = "physics-se-bac2020.pdf";
                break;
            case 54:
                str = "arabic-sci-bac2020.pdf";
                break;
            case 55:
                str = "hisgeo-semtm-bac2020.pdf";
                break;
            case 56:
                str = "islamic-bac2020.pdf";
                break;
            case 57:
                str = "philo-sem-bac2020.pdf";
                break;
            case 58:
                str = "english-sci-bac2020.pdf";
                break;
            case 59:
                str = "french-sci-bac2020.pdf";
                break;
            case 61:
                str = "sciences-se-bac2019.pdf";
                break;
            case 62:
                str = "math-se-bac2019.pdf";
                break;
            case 63:
                str = "physics-se-bac2019.pdf";
                break;
            case 64:
                str = "arabic-sci-bac2019.pdf";
                break;
            case 65:
                str = "hisgeo-semtm-bac2019.pdf";
                break;
            case 66:
                str = "islamic-bac2019.pdf";
                break;
            case 67:
                str = "philo-sem-bac2019.pdf";
                break;
            case 68:
                str = "english-sci-bac2019.pdf";
                break;
            case 69:
                str = "french-sci-bac2019.pdf";
                break;
            case 71:
                str = "sciences-se-bac2018.pdf";
                break;
            case 72:
                str = "math-se-bac2018.pdf";
                break;
            case 73:
                str = "physics-se-bac2018.pdf";
                break;
            case 74:
                str = "arabic-sci-bac2018.pdf";
                break;
            case 75:
                str = "hisgeo-semtm-bac2018.pdf";
                break;
            case 76:
                str = "islamic-bac2018.pdf";
                break;
            case 77:
                str = "philo-sem-bac2018.pdf";
                break;
            case 78:
                str = "english-sci-bac2018.pdf";
                break;
            case 79:
                str = "french-sci-bac2018.pdf";
                break;
            case 81:
                str = "bac2017_2-sciences-se.pdf";
                break;
            case 82:
                str = "bac2017_2-math-se.pdf";
                break;
            case 83:
                str = "bac2017_2-physics-se.pdf";
                break;
            case 84:
                str = "bac2017_2-arabic-sci.pdf";
                break;
            case 85:
                str = "bac2017_2-hisgeo-semtm.pdf";
                break;
            case 86:
                str = "bac2017_2-islamic.pdf";
                break;
            case 87:
                str = "bac2017_2-philo-sem.pdf";
                break;
            case 88:
                str = "bac2017_2-english-sci.pdf";
                break;
            case 89:
                str = "bac2017_2-french-sci.pdf";
                break;
            case 90:
                str = "sciences-se-bac2017.pdf";
                break;
            case 91:
                str = "math-se-bac2017.pdf";
                break;
            case 92:
                str = "physics-se-bac2017.pdf";
                break;
            case 93:
                str = "arabic-sci-bac2017.pdf";
                break;
            case 94:
                str = "hisgeo-semtm-bac2017.pdf";
                break;
            case 95:
                str = "islamic-bac2017.pdf";
                break;
            case 96:
                str = "philo-sem-bac2017.pdf";
                break;
            case 97:
                str = "english-sci-bac2017.pdf";
                break;
            case 98:
                str = "french-sci-bac2017.pdf";
                break;
            case 100:
                str = "sciences-se-bac2016_2.pdf";
                break;
            case 101:
                str = "math-se-bac2016_2.pdf";
                break;
            case 102:
                str = "physics-se-bac2016_2.pdf";
                break;
            case 103:
                str = "arabic-sci-bac2016.pdf";
                break;
            case 104:
                str = "hisgeo-semtm-bac2016_2.pdf";
                break;
            case 105:
                str = "islamic-bac2016.pdf";
                break;
            case 106:
                str = "philo-sem-bac2016_2.pdf";
                break;
            case 107:
                str = "english-sci-bac2016_2.pdf";
                break;
            case 108:
                str = "french-sci-bac2016_2.pdf";
                break;
            case 109:
                str = "sciences-se-bac2016.pdf";
                break;
            case 110:
                str = "math-se-bac2016.pdf";
                break;
            case 111:
                str = "physics-se-bac2016.pdf";
                break;
            case 112:
                str = "hisgeo-semtm-bac2016.pdf";
                break;
            case 113:
                str = "philo-sem-bac2016.pdf";
                break;
            case 114:
                str = "english-sci-bac2016.pdf";
                break;
            case 115:
                str = "french-sci-bac2016.pdf";
                break;
            case 117:
                str = "sciences-se-bac2015.pdf";
                break;
            case 118:
                str = "math-se-bac2015.pdf";
                break;
            case 119:
                str = "physics-se-bac2015.pdf";
                break;
            case 120:
                str = "arabic-sci-bac2015.pdf";
                break;
            case 121:
                str = "hisgeo-semtm-bac2015.pdf";
                break;
            case 122:
                str = "islamic-bac2015.pdf";
                break;
            case 123:
                str = "philo-sem-bac2015.pdf";
                break;
            case 124:
                str = "english-sci-bac2015.pdf";
                break;
            case 125:
                str = "french-sci-bac2015.pdf";
                break;
            case 127:
                str = "eddirasa-com-bac-sci-science-2014.pdf";
                break;
            case 128:
                str = "eddirasa-com-bac-sci-math-2014.pdf";
                break;
            case Opcodes.LOR /* 129 */:
                str = "eddirasa-com-bac-sci-physique-2014.pdf";
                break;
            case 130:
                str = "eddirasa-com-bac-ge-ara-2014.pdf";
                break;
            case Opcodes.LXOR /* 131 */:
                str = "eddirasa-com-bac-sci-his-geo-2014.pdf";
                break;
            case Opcodes.IINC /* 132 */:
                str = "eddirasa-com-bac-li-islamic-2014.pdf";
                break;
            case Opcodes.I2L /* 133 */:
                str = "eddirasa-com-bac-sci-philo-2014.pdf";
                break;
            case Opcodes.I2F /* 134 */:
                str = "eddirasa-com-bac-ge-eng-2014.pdf";
                break;
            case Opcodes.I2D /* 135 */:
                str = "eddirasa-com-bac-ge-fra-2014.pdf";
                break;
            case Opcodes.L2F /* 137 */:
                str = "eddirasa-com-bac-sci-science-2013.pdf";
                break;
            case Opcodes.L2D /* 138 */:
                str = "eddirasa-com-bac-sci-math-2013.pdf";
                break;
            case Opcodes.F2I /* 139 */:
                str = "eddirasa-com-bac-sci-physique-2013.pdf";
                break;
            case Opcodes.F2L /* 140 */:
                str = "eddirasa-com-bac-ge-ara-2013.pdf";
                break;
            case Opcodes.F2D /* 141 */:
                str = "eddirasa-com-bac-sci-his-geo-2013.pdf";
                break;
            case Opcodes.D2I /* 142 */:
                str = "eddirasa-com-bac-li-islamic-2013.pdf";
                break;
            case Opcodes.D2L /* 143 */:
                str = "eddirasa-com-bac-sci-philo-2013.pdf";
                break;
            case Opcodes.D2F /* 144 */:
                str = "eddirasa-com-bac-ge-eng-2013.pdf";
                break;
            case Opcodes.I2B /* 145 */:
                str = "eddirasa-com-bac-ge-fra-2013.pdf";
                break;
            case Opcodes.I2S /* 147 */:
                str = "eddirasa-com-bac-sci-science-2012.pdf";
                break;
            case Opcodes.LCMP /* 148 */:
                str = "eddirasa-com-bac-sci-math-2012.pdf";
                break;
            case Opcodes.FCMPL /* 149 */:
                str = "eddirasa-com-bac-sci-physique-2012.pdf";
                break;
            case Opcodes.FCMPG /* 150 */:
                str = "eddirasa-com-bac-ge-ara-2012.pdf";
                break;
            case Opcodes.DCMPL /* 151 */:
                str = "eddirasa-com-bac-sci-his-geo-2012.pdf";
                break;
            case Opcodes.DCMPG /* 152 */:
                str = "eddirasa-com-bac-li-islamic-2012.pdf";
                break;
            case 153:
                str = "eddirasa-com-bac-sci-philo-2012.pdf";
                break;
            case 154:
                str = "eddirasa-com-bac-ge-eng-2012.pdf";
                break;
            case 155:
                str = "eddirasa-com-bac-ge-fra-2012.pdf";
                break;
            case 157:
                str = "eddirasa-com-bac-sci-science-2011.pdf";
                break;
            case 158:
                str = "eddirasa-com-bac-sci-math-2011.pdf";
                break;
            case Opcodes.IF_ICMPEQ /* 159 */:
                str = "eddirasa-com-bac-sci-physique-2011.pdf";
                break;
            case Opcodes.IF_ICMPNE /* 160 */:
                str = "eddirasa-com-bac-ge-ara-2011.pdf";
                break;
            case Opcodes.IF_ICMPLT /* 161 */:
                str = "eddirasa-com-bac-sci-his-geo-2011.pdf";
                break;
            case Opcodes.IF_ICMPGE /* 162 */:
                str = "eddirasa-com-bac-li-islamic-2011.pdf";
                break;
            case Opcodes.IF_ICMPGT /* 163 */:
                str = "eddirasa-com-bac-ge-philo-2011.pdf";
                break;
            case Opcodes.IF_ICMPLE /* 164 */:
                str = "eddirasa-com-bac-ge-eng-2011.pdf";
                break;
            case Opcodes.IF_ACMPEQ /* 165 */:
                str = "eddirasa-com-bac-ge-fra-2011.pdf";
                break;
            case Opcodes.GOTO /* 167 */:
                str = "eddirasa-com-bac-sci-science-2010.pdf";
                break;
            case Opcodes.JSR /* 168 */:
                str = "eddirasa-com-bac-sci-math-2010.pdf";
                break;
            case Opcodes.RET /* 169 */:
                str = "eddirasa-com-bac-sci-physique-2010.pdf";
                break;
            case Opcodes.TABLESWITCH /* 170 */:
                str = "eddirasa-com-bac-ge-ara-2010.pdf";
                break;
            case Opcodes.LOOKUPSWITCH /* 171 */:
                str = "eddirasa-com-bac-sci-his-geo-2010.pdf";
                break;
            case Opcodes.IRETURN /* 172 */:
                str = "eddirasa-com-bac-li-islamic-2010.pdf";
                break;
            case Opcodes.LRETURN /* 173 */:
                str = "eddirasa-com-bac-ge-philo-2010.pdf";
                break;
            case Opcodes.FRETURN /* 174 */:
                str = "eddirasa-com-bac-ge-eng-2010.pdf";
                break;
            case Opcodes.DRETURN /* 175 */:
                str = "eddirasa-com-bac-ge-fra-2010.pdf";
                break;
            case Opcodes.RETURN /* 177 */:
                str = "eddirasa-bac-sci-science-2009.pdf";
                break;
            case Opcodes.GETSTATIC /* 178 */:
                str = "eddirasa-bac-sci-math-2009.pdf";
                break;
            case Opcodes.PUTSTATIC /* 179 */:
                str = "eddirasa-bac-sci-physique-2009.pdf";
                break;
            case Opcodes.GETFIELD /* 180 */:
                str = "eddirasa-bac-ge-ara-2009.pdf";
                break;
            case Opcodes.PUTFIELD /* 181 */:
                str = "eddirasa-bac-sci-his-geo-2009.pdf";
                break;
            case Opcodes.INVOKEVIRTUAL /* 182 */:
                str = "eddirasa-bac-li-islamic-2009.pdf";
                break;
            case Opcodes.INVOKESPECIAL /* 183 */:
                str = "eddirasa-bac-ge-philo-2009.pdf";
                break;
            case Opcodes.INVOKESTATIC /* 184 */:
                str = "eddirasa-bac-ge-eng-2009.pdf";
                break;
            case Opcodes.INVOKEINTERFACE /* 185 */:
                str = "eddirasa-bac-ge-fra-2009.pdf";
                break;
            case Opcodes.NEW /* 187 */:
                str = "eddirasa-bac-sci-science-2008.pdf";
                break;
            case Opcodes.NEWARRAY /* 188 */:
                str = "eddirasa-bac-sci-math-2008.pdf";
                break;
            case Opcodes.ANEWARRAY /* 189 */:
                str = "eddirasa-bac-sci-physique-2008.pdf";
                break;
            case Opcodes.ARRAYLENGTH /* 190 */:
                str = "eddirasa-bac-ge-ara-2008.pdf";
                break;
            case Opcodes.ATHROW /* 191 */:
                str = "eddirasa-bac-sci-his-geo-2008.pdf";
                break;
            case Opcodes.CHECKCAST /* 192 */:
                str = "eddirasa-bac-li-islamic-2008.pdf";
                break;
            case Opcodes.INSTANCEOF /* 193 */:
                str = "eddirasa-bac-ge-philo-2008.pdf";
                break;
            case Opcodes.MONITORENTER /* 194 */:
                str = "eddirasa-bac-ge-eng-2008.pdf";
                break;
            case Opcodes.MONITOREXIT /* 195 */:
                str = "eddirasa-bac-ge-fra-2008.pdf";
                break;
        }
        if (topicsHolder2.getBindingAdapterPosition() > 195 || topicsHolder2.getBindingAdapterPosition() < 1 || topicsHolder2.getBindingAdapterPosition() == 10 || topicsHolder2.getBindingAdapterPosition() == 20 || topicsHolder2.getBindingAdapterPosition() == 30 || topicsHolder2.getBindingAdapterPosition() == 40 || topicsHolder2.getBindingAdapterPosition() == 50 || topicsHolder2.getBindingAdapterPosition() == 60 || topicsHolder2.getBindingAdapterPosition() == 70 || topicsHolder2.getBindingAdapterPosition() == 80 || topicsHolder2.getBindingAdapterPosition() == 99 || topicsHolder2.getBindingAdapterPosition() == 116 || topicsHolder2.getBindingAdapterPosition() == 126 || topicsHolder2.getBindingAdapterPosition() == 136 || topicsHolder2.getBindingAdapterPosition() == 146 || topicsHolder2.getBindingAdapterPosition() == 156 || topicsHolder2.getBindingAdapterPosition() == 166 || topicsHolder2.getBindingAdapterPosition() == 176 || topicsHolder2.getBindingAdapterPosition() == 186) {
            return;
        }
        TopicsSolutionsActivity.file_Name = str;
        TopicsSolutionsActivity.getInstance().openContent(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == 0) {
            Separate separate = (Separate) list.get(position);
            SeparatesHolder separatesHolder = (SeparatesHolder) holder;
            separatesHolder.txtTitle.setText(separate.getTitle());
            if (separate.isDarkmode()) {
                separatesHolder.lytItemSeparate.setBackgroundColor(Color.parseColor("#424445"));
                return;
            } else {
                separatesHolder.lytItemSeparate.setBackgroundColor(Color.parseColor("#E6ECEF"));
                return;
            }
        }
        Topics topics = (Topics) list.get(position);
        TopicsHolder topicsHolder2 = (TopicsHolder) holder;
        topicsHolder2.txtModule.setText(topics.getModule());
        topicsHolder2.txtSubject.setText(topics.getInformation());
        topicsHolder2.imgItemTopicsSolutions.setImageResource(topics.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return list.get(position) instanceof Separate ? 0 : 1;
    }

    public static class TopicsHolder extends RecyclerView.ViewHolder {
        private final ImageView imgItemTopicsSolutions;
        private final LinearLayout lytItemTopicsSolution;
        private final TextView txtModule;
        private final TextView txtSubject;

        TopicsHolder(View itemView) {
            super(itemView);
            this.txtModule = (TextView) itemView.findViewById(R.id.txtModule);
            this.txtSubject = (TextView) itemView.findViewById(R.id.txtSubject);
            this.imgItemTopicsSolutions = (ImageView) itemView.findViewById(R.id.imgItemTopicsSolutions);
            this.lytItemTopicsSolution = (LinearLayout) itemView.findViewById(R.id.lytItemTopicsSolution);
        }
    }

    public static class SeparatesHolder extends RecyclerView.ViewHolder {
        private final LinearLayout lytItemSeparate;
        private final TextView txtTitle;

        SeparatesHolder(View itemView) {
            super(itemView);
            this.txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
            this.lytItemSeparate = (LinearLayout) itemView.findViewById(R.id.lytItemSeparate);
        }
    }
}
